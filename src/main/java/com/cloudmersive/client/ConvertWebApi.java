package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;
import com.cloudmersive.client.model.HtmlMdResult;
import com.cloudmersive.client.model.HtmlToPdfRequest;
import com.cloudmersive.client.model.ScreenshotRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConvertWebApi {
  /**
   * Convert HTML string to PDF
   * Fully renders a website and returns a PDF of the HTML.  Javascript, HTML5, CSS and other advanced features are all supported.
   * @param input HTML to PDF request parameters (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert/web/html/to/pdf")
  Call<Object> convertWebHtmlToPdf(
    @retrofit2.http.Body HtmlToPdfRequest input
  );

  /**
   * Convert Markdown to HTML
   * Convert a markdown file (.md) to HTML
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;HtmlMdResult&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/web/md/to/html")
  Call<HtmlMdResult> convertWebMdToHtml(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

  /**
   * Convert a URL to PDF
   * Fully renders a website and returns a PDF of the full page.  Javascript, HTML5, CSS and other advanced features are all supported.
   * @param input URL to PDF request parameters (required)
   * @return Call&lt;byte[]&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert/web/url/to/pdf")
  Call<byte[]> convertWebUrlToPdf(
    @retrofit2.http.Body ScreenshotRequest input
  );

  /**
   * Take screenshot of URL
   * Fully renders a website and returns a PNG screenshot of the full page image.  Javascript, HTML5, CSS and other advanced features are all supported.
   * @param input Screenshot request parameters (required)
   * @return Call&lt;byte[]&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert/web/url/to/screenshot")
  Call<byte[]> convertWebUrlToScreenshot(
    @retrofit2.http.Body ScreenshotRequest input
  );

}
