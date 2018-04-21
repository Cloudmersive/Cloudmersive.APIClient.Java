package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import com.cloudmersive.client.model.FaceLocateResponse;
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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-21T01:11:56.694-07:00")
@Component("com.cloudmersive.client.FaceApi")
public class FaceApi {
    private ApiClient apiClient;

    public FaceApi() {
        this(new ApiClient());
    }

    @Autowired
    public FaceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Crop image to face (square)
     * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File faceCropFirst(File imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling faceCropFirst");
        }
        
        String path = UriComponentsBuilder.fromPath("/image/face/crop/first").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (imageFile != null)
            formParams.add("imageFile", new FileSystemResource(imageFile));

        final String[] accepts = { 
            "application/octet-stream"
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
     * Crop image to face (round)
     * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return File
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public File faceCropFirstRound(File imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling faceCropFirstRound");
        }
        
        String path = UriComponentsBuilder.fromPath("/image/face/crop/first/round").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (imageFile != null)
            formParams.add("imageFile", new FileSystemResource(imageFile));

        final String[] accepts = { 
            "application/octet-stream"
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
     * Find faces in an image
     * Locate the positions of all faces in an image
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return FaceLocateResponse
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public FaceLocateResponse faceLocate(File imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling faceLocate");
        }
        
        String path = UriComponentsBuilder.fromPath("/image/face/locate").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (imageFile != null)
            formParams.add("imageFile", new FileSystemResource(imageFile));

        final String[] accepts = { 
            "application/json", "text/json", "application/xml", "text/xml"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<FaceLocateResponse> returnType = new ParameterizedTypeReference<FaceLocateResponse>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
