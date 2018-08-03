package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.CheckResponse;
import com.cloudmersive.client.model.WhoisResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DomainApi
 */
public class DomainApiTest {

    private DomainApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DomainApi.class);
    }

    /**
     * Validate a domain name
     *
     * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
     */
    @Test
    public void domainCheckTest() {
        String domain = null;
        // CheckResponse response = api.domainCheck(domain);

        // TODO: test validations
    }
    /**
     * Get WHOIS information for a domain
     *
     * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
     */
    @Test
    public void domainPostTest() {
        String domain = null;
        // WhoisResponse response = api.domainPost(domain);

        // TODO: test validations
    }
}
