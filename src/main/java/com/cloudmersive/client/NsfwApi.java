package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;

import java.io.File;
import com.cloudmersive.client.model.NsfwResult;

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
@Component("com.cloudmersive.client.NsfwApi")
public class NsfwApi {
    private ApiClient apiClient;

    public NsfwApi() {
        this(new ApiClient());
    }

    @Autowired
    public NsfwApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * NSFW image classifier
     * Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.
     * <p><b>200</b> - OK
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return NsfwResult
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public NsfwResult nsfwClassify(File imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling nsfwClassify");
        }
        
        String path = UriComponentsBuilder.fromPath("/image/nsfw/classify").build().toUriString();
        
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

        ParameterizedTypeReference<NsfwResult> returnType = new ParameterizedTypeReference<NsfwResult>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
