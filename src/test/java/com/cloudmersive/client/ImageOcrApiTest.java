package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import java.io.File;
import com.cloudmersive.client.model.ImageToTextResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImageOcrApi
 */
public class ImageOcrApiTest {

    private ImageOcrApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ImageOcrApi.class);
    }

    /**
     * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.
     *
     * 
     */
    @Test
    public void imageOcrPostTest() {
        File imageFile = null;
        // ImageToTextResponse response = api.imageOcrPost(imageFile);

        // TODO: test validations
    }
}
