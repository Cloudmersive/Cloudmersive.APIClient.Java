package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-21T00:38:10.985-07:00")
@Component("com.cloudmersive.client.ConvertDocumentApi")
public class ConvertDocumentApi {
    private ApiClient apiClient;

    public ConvertDocumentApi() {
        this(new ApiClient());
    }

    @Autowired
    public ConvertDocumentApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Convert Document to PDF
     * Automatically detect file type and convert it to PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File convertDocumentAutodetectToPdf(File inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentAutodetectToPdf");
        }
        
        String path = UriComponentsBuilder.fromPath("/convert/autodetect/to/pdf").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (inputFile != null)
            formParams.add("inputFile", new FileSystemResource(inputFile));

        final String[] accepts = { 
            "application/pdf"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Word DOCX to PDF
     * Convert Office Word Documents (docx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File convertDocumentDocxToPdf(File inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentDocxToPdf");
        }
        
        String path = UriComponentsBuilder.fromPath("/convert/docx/to/pdf").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (inputFile != null)
            formParams.add("inputFile", new FileSystemResource(inputFile));

        final String[] accepts = { 
            "application/pdf"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * PowerPoint PPTX to PDF
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File convertDocumentPptxToPdf(File inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentPptxToPdf");
        }
        
        String path = UriComponentsBuilder.fromPath("/convert/pptx/to/pdf").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (inputFile != null)
            formParams.add("inputFile", new FileSystemResource(inputFile));

        final String[] accepts = { 
            "application/pdf"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Excel XLSX to CSV
     * Convert Office Excel Workbooks (xlsx) to standard Comma-Separated Values (CSV) format.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File convertDocumentXlsxToCsv(File inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToCsv");
        }
        
        String path = UriComponentsBuilder.fromPath("/convert/xlsx/to/csv").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (inputFile != null)
            formParams.add("inputFile", new FileSystemResource(inputFile));

        final String[] accepts = { 
            "application/csv"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Excel XLSX to PDF
     * Convert Office Excel Workbooks (xlsx) to standard PDF.  Converts all worksheets in the workbook to PDF.
     * <p><b>200</b> - OK
     * @param inputFile Input file to perform the operation on.
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File convertDocumentXlsxToPdf(File inputFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'inputFile' is set
        if (inputFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'inputFile' when calling convertDocumentXlsxToPdf");
        }
        
        String path = UriComponentsBuilder.fromPath("/convert/xlsx/to/pdf").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (inputFile != null)
            formParams.add("inputFile", new FileSystemResource(inputFile));

        final String[] accepts = { 
            "application/pdf"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<File> returnType = new ParameterizedTypeReference<File>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
