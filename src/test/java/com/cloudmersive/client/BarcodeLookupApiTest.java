package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.BarcodeLookupResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for BarcodeLookupApi
 */
public class BarcodeLookupApiTest {

    private BarcodeLookupApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(BarcodeLookupApi.class);
    }

    /**
     * Lookup a barcode value and return product data
     *
     * 
     */
    @Test
    public void barcodeLookupEanLookupTest() {
        String value = null;
        // BarcodeLookupResponse response = api.barcodeLookupEanLookup(value);

        // TODO: test validations
    }
}
