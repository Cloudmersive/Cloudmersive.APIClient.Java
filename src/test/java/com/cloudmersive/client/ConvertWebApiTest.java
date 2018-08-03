package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import java.io.File;
import com.cloudmersive.client.model.HtmlMdResult;
import com.cloudmersive.client.model.HtmlToPdfRequest;
import com.cloudmersive.client.model.ScreenshotRequest;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertWebApi
 */
public class ConvertWebApiTest {

    private ConvertWebApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConvertWebApi.class);
    }

    /**
     * Convert HTML string to PDF
     *
     * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     */
    @Test
    public void convertWebHtmlToPdfTest() {
        HtmlToPdfRequest input = null;
        // Object response = api.convertWebHtmlToPdf(input);

        // TODO: test validations
    }
    /**
     * Convert Markdown to HTML
     *
     * Convert a markdown file (.md) to HTML
     */
    @Test
    public void convertWebMdToHtmlTest() {
        File inputFile = null;
        // HtmlMdResult response = api.convertWebMdToHtml(inputFile);

        // TODO: test validations
    }
    /**
     * Convert a URL to PDF
     *
     * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
     */
    @Test
    public void convertWebUrlToPdfTest() {
        ScreenshotRequest input = null;
        // byte[] response = api.convertWebUrlToPdf(input);

        // TODO: test validations
    }
    /**
     * Take screenshot of URL
     *
     * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
     */
    @Test
    public void convertWebUrlToScreenshotTest() {
        ScreenshotRequest input = null;
        // byte[] response = api.convertWebUrlToScreenshot(input);

        // TODO: test validations
    }
}
