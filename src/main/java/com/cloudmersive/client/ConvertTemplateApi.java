package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.HtmlTemplateApplicationRequest;
import com.cloudmersive.client.model.HtmlTemplateApplicationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ConvertTemplateApi {
  /**
   * Apply HTML template
   * Apply operations to fill in an HTML template, generating a final HTML result
   * @param value Operations to apply to template (required)
   * @return Call&lt;HtmlTemplateApplicationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("convert/template/html/apply")
  Call<HtmlTemplateApplicationResponse> convertTemplateApplyHtmlTemplate(
    @retrofit2.http.Body HtmlTemplateApplicationRequest value
  );

}
