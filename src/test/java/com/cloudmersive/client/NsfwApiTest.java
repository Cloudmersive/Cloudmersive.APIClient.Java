package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import java.io.File;
import com.cloudmersive.client.model.NsfwResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NsfwApi
 */
public class NsfwApiTest {

    private NsfwApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NsfwApi.class);
    }

    /**
     * Not safe for work (NSFW) racy content classification
     *
     * Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.
     */
    @Test
    public void nsfwClassifyTest() {
        File imageFile = null;
        // NsfwResult response = api.nsfwClassify(imageFile);

        // TODO: test validations
    }
}
