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
import com.cloudmersive.client.model.JobStatusResult;
import com.cloudmersive.client.model.PptxSplitAdvancedRequest;
import com.cloudmersive.client.model.PptxSplitAdvancedResponse;
import com.cloudmersive.client.model.SplitBatchJobCreateResult;
import com.cloudmersive.client.model.SplitDocxDocumentResult;
import com.cloudmersive.client.model.SplitPdfResult;
import com.cloudmersive.client.model.SplitPptxPresentationResult;
import com.cloudmersive.client.model.SplitTextDocumentByLinesResult;
import com.cloudmersive.client.model.SplitTextDocumentByStringResult;
import com.cloudmersive.client.model.SplitXlsxWorksheetResult;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SplitDocumentApi
 */
@Ignore
public class SplitDocumentApiTest {

    private final SplitDocumentApi api = new SplitDocumentApi();

    
    /**
     * Split a single Document into Separate Documents by Page as a Batch Job
     *
     * Split a Document (PPTX supported), comprised of multiple pages into separate files, with each containing exactly one page.  This API is designed for large jobs that could take a long time to create and so runs as a batch job that returns a Job ID that you can use with the GetAsyncJobStatus API to check on the status of the Job and ultimately get the output result.  This API automatically detects the document type and then performs the split by using the document type-specific API needed to perform the split.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentBatchJobCreateTest() throws Exception {
        File inputFile = null;
        Boolean returnDocumentContents = null;
        SplitBatchJobCreateResult response = api.splitDocumentBatchJobCreate(inputFile, returnDocumentContents);

        // TODO: test validations
    }
    
    /**
     * Split a single Word Document DOCX into Separate Documents by Page
     *
     * Split a Word DOCX Document, comprised of multiple pages into separate Word DOCX document files, with each containing exactly one page.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentDocxTest() throws Exception {
        File inputFile = null;
        Boolean returnDocumentContents = null;
        SplitDocxDocumentResult response = api.splitDocumentDocx(inputFile, returnDocumentContents);

        // TODO: test validations
    }
    
    /**
     * Get the status and result of a Split Document Batch Job
     *
     * Returns the result of the Async Job - possible states can be STARTED or COMPLETED.  This API is only available for Cloudmersive Managed Instance and Private Cloud deployments.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentGetAsyncJobStatusTest() throws Exception {
        String asyncJobID = null;
        JobStatusResult response = api.splitDocumentGetAsyncJobStatus(asyncJobID);

        // TODO: test validations
    }
    
    /**
     * Split a PDF file into separate PDF files, one per page
     *
     * Split an input PDF file into separate pages, comprised of one PDF file per page.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentPdfByPageTest() throws Exception {
        File inputFile = null;
        Boolean returnDocumentContents = null;
        SplitPdfResult response = api.splitDocumentPdfByPage(inputFile, returnDocumentContents);

        // TODO: test validations
    }
    
    /**
     * Split a single PowerPoint Presentation PPTX into Separate Slides
     *
     * Split an PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentation files, with each containing exactly one slide.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentPptxTest() throws Exception {
        File inputFile = null;
        Boolean returnDocumentContents = null;
        SplitPptxPresentationResult response = api.splitDocumentPptx(inputFile, returnDocumentContents);

        // TODO: test validations
    }
    
    /**
     * Split a single PowerPoint Presentation PPTX into Separate Presentations
     *
     * Split a PowerPoint PPTX Presentation, comprised of multiple slides into separate PowerPoint PPTX presentations of customizeable size.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentPptxAdvancedTest() throws Exception {
        PptxSplitAdvancedRequest request = null;
        PptxSplitAdvancedResponse response = api.splitDocumentPptxAdvanced(request);

        // TODO: test validations
    }
    
    /**
     * Split a single Text file (txt) into lines
     *
     * Split a Text (txt) Document by line, returning each line separately in order.  Supports multiple types of newlines.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentTxtByLineTest() throws Exception {
        File inputFile = null;
        SplitTextDocumentByLinesResult response = api.splitDocumentTxtByLine(inputFile);

        // TODO: test validations
    }
    
    /**
     * Split a single Text file (txt) by a string delimiter
     *
     * Split a Text (txt) Document by a string delimiter, returning each component of the string as an array of strings.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentTxtByStringTest() throws Exception {
        File inputFile = null;
        String splitDelimiter = null;
        Boolean skipEmptyElements = null;
        SplitTextDocumentByStringResult response = api.splitDocumentTxtByString(inputFile, splitDelimiter, skipEmptyElements);

        // TODO: test validations
    }
    
    /**
     * Split a single Excel XLSX into Separate Worksheets
     *
     * Split an Excel XLSX Spreadsheet, comprised of multiple Worksheets (or Tabs) into separate Excel XLSX spreadsheet files, with each containing exactly one Worksheet.
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void splitDocumentXlsxTest() throws Exception {
        File inputFile = null;
        Boolean returnDocumentContents = null;
        SplitXlsxWorksheetResult response = api.splitDocumentXlsx(inputFile, returnDocumentContents);

        // TODO: test validations
    }
    
}
