/*
 * convertapi
 * Convert API lets you effortlessly convert file formats and types.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import java.io.File;
import com.cloudmersive.client.model.HtmlMdResult;
import com.cloudmersive.client.model.HtmlToOfficeRequest;
import com.cloudmersive.client.model.HtmlToPdfRequest;
import com.cloudmersive.client.model.HtmlToPngRequest;
import com.cloudmersive.client.model.HtmlToTextRequest;
import com.cloudmersive.client.model.HtmlToTextResponse;
import com.cloudmersive.client.model.ScreenshotRequest;
import com.cloudmersive.client.model.UrlToPdfRequest;
import com.cloudmersive.client.model.UrlToTextRequest;
import com.cloudmersive.client.model.UrlToTextResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertWebApi
 */
@Ignore
public class ConvertWebApiTest {

    private final ConvertWebApi api = new ConvertWebApi();

    
    /**
     * Convert HTML to Word DOCX Document
     *
     * Convert HTML to Office Word Document (DOCX) format
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebHtmlToDocxTest() throws Exception {
        HtmlToOfficeRequest inputRequest = null;
        byte[] response = api.convertWebHtmlToDocx(inputRequest);

        // TODO: test validations
    }
    
    /**
     * Convert HTML string to PDF
     *
     * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebHtmlToPdfTest() throws Exception {
        HtmlToPdfRequest input = null;
        byte[] response = api.convertWebHtmlToPdf(input);

        // TODO: test validations
    }
    
    /**
     * Convert HTML string to PNG screenshot
     *
     * Fully renders a website and returns a PNG (screenshot) of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebHtmlToPngTest() throws Exception {
        HtmlToPngRequest input = null;
        byte[] response = api.convertWebHtmlToPng(input);

        // TODO: test validations
    }
    
    /**
     * Convert HTML string to text (txt)
     *
     * Converts an HTML string input into text (txt); extracts text from HTML
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebHtmlToTxtTest() throws Exception {
        HtmlToTextRequest input = null;
        HtmlToTextResponse response = api.convertWebHtmlToTxt(input);

        // TODO: test validations
    }
    
    /**
     * Convert Markdown to HTML
     *
     * Convert a markdown file (.md) to HTML
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebMdToHtmlTest() throws Exception {
        File inputFile = null;
        HtmlMdResult response = api.convertWebMdToHtml(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert a URL to PDF
     *
     * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebUrlToPdfTest() throws Exception {
        UrlToPdfRequest input = null;
        byte[] response = api.convertWebUrlToPdf(input);

        // TODO: test validations
    }
    
    /**
     * Take screenshot of URL
     *
     * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebUrlToScreenshotTest() throws Exception {
        ScreenshotRequest input = null;
        byte[] response = api.convertWebUrlToScreenshot(input);

        // TODO: test validations
    }
    
    /**
     * Convert website URL page to text (txt)
     *
     * Converts a website URL page into text (txt); extracts text from HTML
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void convertWebUrlToTxtTest() throws Exception {
        UrlToTextRequest input = null;
        UrlToTextResponse response = api.convertWebUrlToTxt(input);

        // TODO: test validations
    }
    
}
