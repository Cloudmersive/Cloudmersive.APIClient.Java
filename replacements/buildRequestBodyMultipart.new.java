    /** Build a request body based on the supplied parameters. */
    public RequestBody buildRequestBodyMultipart(Map<String, Object> formParams) {
        MultipartBuilder mpBuilder = new MultipartBuilder().type(MultipartBuilder.FORM);

        for (Map.Entry<String, Object> param : formParams.entrySet()) {
            String fieldName = param.getKey();
            Object value     = param.getValue();

            if (value instanceof File) {
                // ----- File part (kept as multipart) -----
                File file = (File) value;
                Headers headers = Headers.of(
                        "Content-Disposition",
                        "form-data; name=\"" + fieldName + "\"; filename=\"" + file.getName() + '"'
                );
                MediaType mediaType = MediaType.parse(guessContentTypeFromFile(file));
                mpBuilder.addPart(headers, RequestBody.create(mediaType, file));

            } else if (value instanceof InputStream) {
                // ===== CHANGED SECTION =====
                // Stream goes out as the *only* body, not multipart.
                MediaType mediaType = MediaType.parse("application/octet-stream");
                return createRequestBodyFromInputStream(mediaType, (InputStream) value);

            } else {
                // ----- Simple text field -----
                Headers headers = Headers.of(
                        "Content-Disposition",
                        "form-data; name=\"" + fieldName + '"'
                );
                mpBuilder.addPart(headers,
                        RequestBody.create(
                                null,                       // text/plain; charset=utf-8 (OkHttp default)
                                parameterToString(value)
                        )
                );
            }
        }
        return mpBuilder.build();   // executes if NO InputStream was encountered
    }

    /**
     * Wrap an InputStream in a RequestBody suitable for OkHttp streaming.
     * <p>**contentLength() is deliberately left ‑1** so OkHttp will use
     * chunked transfer encoding automatically.</p>
     */
    private RequestBody createRequestBodyFromInputStream(
            final MediaType mediaType,
            final InputStream inputStream) {

        return new RequestBody() {
            @Override public MediaType contentType() {
                return mediaType;
            }

            @Override public long contentLength() {
                return -1L;         // unknown → triggers chunked transfer
            }

            @Override public void writeTo(BufferedSink sink) throws IOException {
                try (InputStream in = inputStream) {
                    sink.writeAll(Okio.source(in));  // stream → network
                }
            }
        };
    }