package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.PosRequest;
import com.cloudmersive.client.model.PosResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PosTaggerJsonApi
 */
public class PosTaggerJsonApiTest {

    private PosTaggerJsonApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(PosTaggerJsonApi.class);
    }

    /**
     * Part-of-speech tag a string
     *
     * Part-of-speech (POS) tag a string and return result as JSON
     */
    @Test
    public void posTaggerJsonPostTest() {
        PosRequest request = null;
        // PosResponse response = api.posTaggerJsonPost(request);

        // TODO: test validations
    }
}
