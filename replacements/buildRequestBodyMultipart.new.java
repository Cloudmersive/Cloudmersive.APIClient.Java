/**
 * Build a multipart (file uploading) request body with the given form parameters,
 * which could contain text fields, file fields, or input streams.
 *
 * @param formParams Form parameters in the form of Map
 * @return RequestBody
 */
public RequestBody buildRequestBodyMultipart(Map<String, Object> formParams) {
    MultipartBuilder mpBuilder = new MultipartBuilder().type(MultipartBuilder.FORM);

    for (Map.Entry<String, Object> param : formParams.entrySet()) {
        String fieldName = param.getKey();
        Object value = param.getValue();

        if (value instanceof File) {
            // Handle File
            File file = (File) value;
            Headers partHeaders = Headers.of(
                    "Content-Disposition",
                    "form-data; name=\"" + fieldName + "\"; filename=\"" + file.getName() + "\""
            );
            MediaType mediaType = MediaType.parse(guessContentTypeFromFile(file));
            mpBuilder.addPart(partHeaders, RequestBody.create(mediaType, file));

        } else if (value instanceof InputStream) {
            // Handle InputStream
            InputStream inputStream = (InputStream) value;
            // If you need a filename, you can hardcode or pass it in some way:
            String fileName = "uploaded_stream";  // Or derive it from somewhere
            Headers partHeaders = Headers.of(
                    "Content-Disposition",
                    "form-data; name=\"" + fieldName + "\"; filename=\"" + fileName + "\""
            );
            // Choose a default content type or allow the caller to specify
            MediaType mediaType = MediaType.parse("application/octet-stream");
            mpBuilder.addPart(partHeaders, createRequestBodyFromInputStream(mediaType, inputStream));

        } else {
            // Handle text field
            Headers partHeaders = Headers.of(
                    "Content-Disposition",
                    "form-data; name=\"" + fieldName + "\""
            );
            mpBuilder.addPart(partHeaders,
                    RequestBody.create(
                            null,
                            parameterToString(value)
                    )
            );
        }
    }
    return mpBuilder.build();
}

/**
 * Create a RequestBody from an InputStream. This allows large streams
 * to be written without loading them fully into memory.
 */
private RequestBody createRequestBodyFromInputStream(
        final MediaType mediaType,
        final InputStream inputStream
) {
    return new RequestBody() {
        @Override
        public MediaType contentType() {
            return mediaType;
        }

        @Override
        public void writeTo(BufferedSink sink) throws IOException {
            // Buffer size can be adjusted; 8K is a typical default
            byte[] buffer = new byte[8192];
            int bytesRead;
            try {
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    sink.write(buffer, 0, bytesRead);
                }
            } finally {
                inputStream.close();
            }
        }
    };
}
