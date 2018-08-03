package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.AddressGetServersResponse;
import com.cloudmersive.client.model.AddressVerifySyntaxOnlyResponse;
import com.cloudmersive.client.model.FullEmailValidationResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EmailApi
 */
public class EmailApiTest {

    private EmailApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(EmailApi.class);
    }

    /**
     * Partially check whether an email address is valid
     *
     * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
     */
    @Test
    public void emailAddressGetServersTest() {
        String email = null;
        // AddressGetServersResponse response = api.emailAddressGetServers(email);

        // TODO: test validations
    }
    /**
     * Fully validate an email address
     *
     * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
     */
    @Test
    public void emailFullValidationTest() {
        String email = null;
        // FullEmailValidationResponse response = api.emailFullValidation(email);

        // TODO: test validations
    }
    /**
     * Validate email adddress for syntactic correctness only
     *
     * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
     */
    @Test
    public void emailPostTest() {
        String value = null;
        // AddressVerifySyntaxOnlyResponse response = api.emailPost(value);

        // TODO: test validations
    }
}
