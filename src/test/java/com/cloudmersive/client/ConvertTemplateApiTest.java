package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.HtmlTemplateApplicationRequest;
import com.cloudmersive.client.model.HtmlTemplateApplicationResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertTemplateApi
 */
public class ConvertTemplateApiTest {

    private ConvertTemplateApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConvertTemplateApi.class);
    }

    /**
     * Apply HTML template
     *
     * Apply operations to fill in an HTML template, generating a final HTML result
     */
    @Test
    public void convertTemplateApplyHtmlTemplateTest() {
        HtmlTemplateApplicationRequest value = null;
        // HtmlTemplateApplicationResponse response = api.convertTemplateApplyHtmlTemplate(value);

        // TODO: test validations
    }
}
