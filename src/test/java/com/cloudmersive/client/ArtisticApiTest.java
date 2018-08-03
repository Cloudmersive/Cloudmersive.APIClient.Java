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
 * API tests for ArtisticApi
 */
public class ArtisticApiTest {

    private ArtisticApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ArtisticApi.class);
    }

    /**
     * Transform an image into an artistic painting automatically
     *
     * Uses machine learning to automatically transform an image into an artistic painting.  Due to depth of AI processing, depending on image size this operation can take up to 20 seconds.
     */
    @Test
    public void artisticPaintingTest() {
        String style = null;
        File imageFile = null;
        // Object response = api.artisticPainting(style, imageFile);

        // TODO: test validations
    }
}
