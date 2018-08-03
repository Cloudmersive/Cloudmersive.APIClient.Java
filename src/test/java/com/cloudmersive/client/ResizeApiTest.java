package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ResizeApi
 */
public class ResizeApiTest {

    private ResizeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ResizeApi.class);
    }

    /**
     * Resize an image with parameters
     *
     * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
     */
    @Test
    public void resizePostTest() {
        Integer maxWidth = null;
        Integer maxHeight = null;
        File imageFile = null;
        // Object response = api.resizePost(maxWidth, maxHeight, imageFile);

        // TODO: test validations
    }
}
