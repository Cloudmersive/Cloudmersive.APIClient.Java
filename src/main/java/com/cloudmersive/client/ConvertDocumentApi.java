package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConvertDocumentApi {
  /**
   * Convert Document to PDF
   * Automatically detect file type and convert it to PDF.
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;byte[]&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/autodetect/to/pdf")
  Call<byte[]> convertDocumentAutodetectToPdf(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

  /**
   * Word DOCX to PDF
   * Convert Office Word Documents (docx) to standard PDF
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;byte[]&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/docx/to/pdf")
  Call<byte[]> convertDocumentDocxToPdf(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

  /**
   * PowerPoint PPTX to PDF
   * Convert Office PowerPoint Documents (pptx) to standard PDF
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;byte[]&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/pptx/to/pdf")
  Call<byte[]> convertDocumentPptxToPdf(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

  /**
   * Excel XLSX to CSV
   * Convert Office Excel Workbooks (xlsx) to standard Comma-Separated Values (CSV) format.
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;byte[]&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/xlsx/to/csv")
  Call<byte[]> convertDocumentXlsxToCsv(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

  /**
   * Excel XLSX to PDF
   * Convert Office Excel Workbooks (xlsx) to standard PDF.  Converts all worksheets in the workbook to PDF.
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;byte[]&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/xlsx/to/pdf")
  Call<byte[]> convertDocumentXlsxToPdf(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

}
