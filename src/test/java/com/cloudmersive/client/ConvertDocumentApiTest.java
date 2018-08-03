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
 * API tests for ConvertDocumentApi
 */
public class ConvertDocumentApiTest {

    private ConvertDocumentApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConvertDocumentApi.class);
    }

    /**
     * Convert Document to PDF
     *
     * Automatically detect file type and convert it to PDF.
     */
    @Test
    public void convertDocumentAutodetectToPdfTest() {
        File inputFile = null;
        // byte[] response = api.convertDocumentAutodetectToPdf(inputFile);

        // TODO: test validations
    }
    /**
     * Word DOCX to PDF
     *
     * Convert Office Word Documents (docx) to standard PDF
     */
    @Test
    public void convertDocumentDocxToPdfTest() {
        File inputFile = null;
        // byte[] response = api.convertDocumentDocxToPdf(inputFile);

        // TODO: test validations
    }
    /**
     * PowerPoint PPTX to PDF
     *
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     */
    @Test
    public void convertDocumentPptxToPdfTest() {
        File inputFile = null;
        // byte[] response = api.convertDocumentPptxToPdf(inputFile);

        // TODO: test validations
    }
    /**
     * Excel XLSX to CSV
     *
     * Convert Office Excel Workbooks (xlsx) to standard Comma-Separated Values (CSV) format.
     */
    @Test
    public void convertDocumentXlsxToCsvTest() {
        File inputFile = null;
        // byte[] response = api.convertDocumentXlsxToCsv(inputFile);

        // TODO: test validations
    }
    /**
     * Excel XLSX to PDF
     *
     * Convert Office Excel Workbooks (xlsx) to standard PDF.  Converts all worksheets in the workbook to PDF.
     */
    @Test
    public void convertDocumentXlsxToPdfTest() {
        File inputFile = null;
        // byte[] response = api.convertDocumentXlsxToPdf(inputFile);

        // TODO: test validations
    }
}
