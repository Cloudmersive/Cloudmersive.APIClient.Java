package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ExtractEntitiesStringApi
 */
public class ExtractEntitiesStringApiTest {

    private ExtractEntitiesStringApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ExtractEntitiesStringApi.class);
    }

    /**
     * Extract entities from string
     *
     * Extract the named entitites from an input string.
     */
    @Test
    public void extractEntitiesStringPostTest() {
        String value = null;
        // String response = api.extractEntitiesStringPost(value);

        // TODO: test validations
    }
}
