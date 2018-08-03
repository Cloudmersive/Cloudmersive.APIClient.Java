package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ParseStringApi
 */
public class ParseStringApiTest {

    private ParseStringApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ParseStringApi.class);
    }

    /**
     * Parse string to syntax tree
     *
     * Parses the input string into a Penn Treebank syntax tree
     */
    @Test
    public void parseStringPostTest() {
        String input = null;
        // String response = api.parseStringPost(input);

        // TODO: test validations
    }
}
