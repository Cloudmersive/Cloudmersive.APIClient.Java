package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.GeolocateResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for IpAddressApi
 */
public class IpAddressApiTest {

    private IpAddressApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(IpAddressApi.class);
    }

    /**
     * Geolocate an IP address
     *
     * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
     */
    @Test
    public void iPAddressPostTest() {
        String value = null;
        // GeolocateResponse response = api.iPAddressPost(value);

        // TODO: test validations
    }
}
