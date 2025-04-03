private ApiClient apiClient;

/**
     * Build call for scanFileAdvanced
     * @param inputFile Input file to perform the operation on. (required)
     * @param allowExecutables Set to false to block executable files (program code) from being allowed in the input file.  Default is false (recommended). (optional)
     * @param allowInvalidFiles Set to false to block invalid files, such as a PDF file that is not really a valid PDF file, or a Word Document that is not a valid Word Document.  Default is false (recommended). (optional)
     * @param allowScripts Set to false to block script files, such as a PHP files, Python scripts, and other malicious content or security threats that can be embedded in the file.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowPasswordProtectedFiles Set to false to block password protected and encrypted files, such as encrypted zip and rar files, and other files that seek to circumvent scanning through passwords.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowMacros Set to false to block macros and other threats embedded in document files, such as Word, Excel and PowerPoint embedded Macros (including support for .DOCX, .XLSX, .PPTX, .DOC and .XLS), and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowXmlExternalEntities Set to false to block XML External Entities and other threats embedded in XML files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowInsecureDeserialization Set to false to block Insecure Deserialization and other threats embedded in JSON and other object serialization files, and other files that contain embedded content threats.  Set to true to allow these file types.  Default is false (recommended). (optional)
     * @param allowHtml Set to false to block HTML input in the top level file; HTML can contain XSS, scripts, local file accesses and other threats.  Set to true to allow these file types.  Default is false (recommended) [for API keys created prior to the release of this feature default is true for backward compatability].  If set to true, HTML files containing script tags will be allowed, but ContainsScript will be set to true if script tags are present. (optional)
     * @param allowUnsafeArchives Set to false to block unsafe archives such as Zip Bombs, and other archives that can cause unsafe extraction outcomes.  Default is false (recommended).  If set to true, unsafe archives will be allowed. (optional)
     * @param allowOleEmbeddedObject Set to false to block OLE embedded objects, which can contain vulnerabilities and executable code.  Default is false (recommended).  If set to true, OLE embedded objects will be allowed. (optional)
     * @param options Comma separated set of configuration operations.  Include permitJavascriptAndHtmlInPDFs to allow JavaScript and HTML in PDF files.  Default is no options. (optional)
     * @param restrictFileTypes Specify a restricted set of file formats to allow as clean as a comma-separated list of file formats, such as .pdf,.docx,.png would allow only PDF, PNG and Word document files.  All files must pass content verification against this list of file formats, if they do not, then the result will be returned as CleanResult&#x3D;false.  Set restrictFileTypes parameter to null or empty string to disable; default is disabled. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call scanFileAdvancedCall(java.io.InputStream inputFile, Boolean allowExecutables, Boolean allowInvalidFiles, Boolean allowScripts, Boolean allowPasswordProtectedFiles, Boolean allowMacros, Boolean allowXmlExternalEntities, Boolean allowInsecureDeserialization, Boolean allowHtml, Boolean allowUnsafeArchives, Boolean allowOleEmbeddedObject, String options, String restrictFileTypes, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/virus/scan/file/advanced";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        if (allowExecutables != null)
        localVarHeaderParams.put("allowExecutables", apiClient.parameterToString(allowExecutables));
        if (allowInvalidFiles != null)
        localVarHeaderParams.put("allowInvalidFiles", apiClient.parameterToString(allowInvalidFiles));
        if (allowScripts != null)
        localVarHeaderParams.put("allowScripts", apiClient.parameterToString(allowScripts));
        if (allowPasswordProtectedFiles != null)
        localVarHeaderParams.put("allowPasswordProtectedFiles", apiClient.parameterToString(allowPasswordProtectedFiles));
        if (allowMacros != null)
        localVarHeaderParams.put("allowMacros", apiClient.parameterToString(allowMacros));
        if (allowXmlExternalEntities != null)
        localVarHeaderParams.put("allowXmlExternalEntities", apiClient.parameterToString(allowXmlExternalEntities));
        if (allowInsecureDeserialization != null)
        localVarHeaderParams.put("allowInsecureDeserialization", apiClient.parameterToString(allowInsecureDeserialization));
        if (allowHtml != null)
        localVarHeaderParams.put("allowHtml", apiClient.parameterToString(allowHtml));
        if (allowUnsafeArchives != null)
        localVarHeaderParams.put("allowUnsafeArchives", apiClient.parameterToString(allowUnsafeArchives));
        if (allowOleEmbeddedObject != null)
        localVarHeaderParams.put("allowOleEmbeddedObject", apiClient.parameterToString(allowOleEmbeddedObject));
        if (options != null)
        localVarHeaderParams.put("options", apiClient.parameterToString(options));
        if (restrictFileTypes != null)
        localVarHeaderParams.put("restrictFileTypes", apiClient.parameterToString(restrictFileTypes));

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();
        if (inputFile != null)
        localVarFormParams.put("inputFile", inputFile);

        final String[] localVarAccepts = {
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "multipart/form-data"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] { "Apikey" };
        if (headers != null) {
            localVarHeaderParams.putAll(headers);
        }
        return apiClient.buildCall(localVarPath, "POST", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }