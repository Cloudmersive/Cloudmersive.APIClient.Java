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

import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.model.AutodetectGetInfoResult;
import java.io.File;
import com.cloudmersive.client.model.PdfToPngResult;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertDocumentApi
 */
@Ignore
public class ConvertDocumentApiTest {

    private final ConvertDocumentApi api = new ConvertDocumentApi();

    
    /**
     * Get document type information
     *
     * Auto-detects a document&#39;s type information; does not require file extension.  Analyzes file contents to confirm file type.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentAutodetectGetInfoTest() throws ApiException {
        File inputFile = null;
        AutodetectGetInfoResult response = api.convertDocumentAutodetectGetInfo(inputFile);

        // TODO: test validations
    }
    
    /**
     * Convert Document to PDF
     *
     * Automatically detect file type and convert it to PDF.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentAutodetectToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentAutodetectToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * CSV to Excel XLSX
     *
     * Convert CSV file to Office Excel XLSX Workbooks file format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentCsvToXlsxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentCsvToXlsx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Word DOC (97-03) to DOCX
     *
     * Convert/upgrade Office Word (97-2003 Format) Documents (doc) to the modern DOCX format
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocToDocxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentDocToDocx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Word DOC (97-03) to PDF
     *
     * Convert Office Word (97-2003 Format) Documents (doc) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentDocToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Word DOCX to PDF
     *
     * Convert Office Word Documents (docx) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentDocxToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentDocxToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * PDF to PNG Array
     *
     * Convert PDF document to PNG array, one image per page.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPdfToPngArrayTest() throws ApiException {
        File inputFile = null;
        PdfToPngResult response = api.convertDocumentPdfToPngArray(inputFile);

        // TODO: test validations
    }
    
    /**
     * PowerPoint PPT (97-03) to PDF
     *
     * Convert Office PowerPoint (97-2003) Documents (ppt) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPptToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * PowerPoint PPT (97-03) to PPTX
     *
     * Convert/upgrade Office PowerPoint (97-2003) Documents (ppt) to modern PPTX
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptToPptxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPptToPptx(inputFile);

        // TODO: test validations
    }
    
    /**
     * PowerPoint PPTX to PDF
     *
     * Convert Office PowerPoint Documents (pptx) to standard PDF
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentPptxToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentPptxToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Excel XLS (97-03) to PDF
     *
     * Convert Office Excel (97-2003) Workbooks (xls) to standard PDF.  Converts all worksheets in the workbook to PDF.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsToPdf(inputFile);

        // TODO: test validations
    }
    
    /**
     * Excel XLS (97-03) to XLSX
     *
     * Convert/upgrade Office Excel (97-2003) Workbooks (xls) to modern XLSX format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsToXlsxTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsToXlsx(inputFile);

        // TODO: test validations
    }
    
    /**
     * Excel XLSX to CSV
     *
     * Convert Office Excel Workbooks (xlsx) to standard Comma-Separated Values (CSV) format.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsxToCsvTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsxToCsv(inputFile);

        // TODO: test validations
    }
    
    /**
     * Excel XLSX to PDF
     *
     * Convert Office Excel Workbooks (xlsx) to standard PDF.  Converts all worksheets in the workbook to PDF.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void convertDocumentXlsxToPdfTest() throws ApiException {
        File inputFile = null;
        byte[] response = api.convertDocumentXlsxToPdf(inputFile);

        // TODO: test validations
    }
    
}
