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
 * API tests for ConvertDataApi
 */
public class ConvertDataApiTest {

    private ConvertDataApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConvertDataApi.class);
    }

    /**
     * CSV to JSON conversion
     *
     * Convert a CSV file to a JSON object array
     */
    @Test
    public void convertDataCsvToJsonTest() {
        File inputFile = null;
        // Object response = api.convertDataCsvToJson(inputFile);

        // TODO: test validations
    }
    /**
     * XML to JSON conversion
     *
     * Convert an XML string or file into JSON
     */
    @Test
    public void convertDataXmlToJsonTest() {
        File inputFile = null;
        // Object response = api.convertDataXmlToJson(inputFile);

        // TODO: test validations
    }
}
