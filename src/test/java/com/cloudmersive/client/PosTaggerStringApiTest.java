package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PosTaggerStringApi
 */
public class PosTaggerStringApiTest {

    private PosTaggerStringApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PosTaggerStringApi.class);
    }

    /**
     * Part-of-speech tag a string
     *
     * Perform a part-of-speech (POS) tagging on the input string.
     */
    @Test
    public void posTaggerStringPostTest() {
        String input = null;
        // String response = api.posTaggerStringPost(input);

        // TODO: test validations
    }
}
