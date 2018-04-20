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

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-04-19T20:05:35.150-07:00")
@Component("com.cloudmersive.client.ResizeApi")
public class ResizeApi {
    private ApiClient apiClient;

    public ResizeApi() {
        this(new ApiClient());
    }

    @Autowired
    public ResizeApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Resize an image with parameters
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
     * <p><b>200</b> - OK
     * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width
     * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height
     * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported.
     * @return Object
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Object resizePost(Integer maxWidth, Integer maxHeight, File imageFile) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'maxWidth' is set
        if (maxWidth == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maxWidth' when calling resizePost");
        }
        
        // verify the required parameter 'maxHeight' is set
        if (maxHeight == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'maxHeight' when calling resizePost");
        }
        
        // verify the required parameter 'imageFile' is set
        if (imageFile == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'imageFile' when calling resizePost");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("maxWidth", maxWidth);
        uriVariables.put("maxHeight", maxHeight);
        String path = UriComponentsBuilder.fromPath("/image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();
        
        if (imageFile != null)
            formParams.add("imageFile", new FileSystemResource(imageFile));

        final String[] accepts = { 
            "image/png"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "multipart/form-data"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Object> returnType = new ParameterizedTypeReference<Object>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
