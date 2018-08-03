package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.VatLookupRequest;
import com.cloudmersive.client.model.VatLookupResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for VatApi
 */
public class VatApiTest {

    private VatApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(VatApi.class);
    }

    /**
     * Lookup a VAT code
     *
     * Checks if a VAT code is valid, and if it is, returns more information about it
     */
    @Test
    public void vatVatLookupTest() {
        VatLookupRequest input = null;
        // VatLookupResponse response = api.vatVatLookup(input);

        // TODO: test validations
    }
}
