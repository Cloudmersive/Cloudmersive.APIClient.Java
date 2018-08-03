package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SentencesApi
 */
public class SentencesApiTest {

    private SentencesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SentencesApi.class);
    }

    /**
     * Extract sentences from string
     *
     * Segment an input string into separate sentences, output result as a string.
     */
    @Test
    public void sentencesPostTest() {
        String input = null;
        // String response = api.sentencesPost(input);

        // TODO: test validations
    }
}
