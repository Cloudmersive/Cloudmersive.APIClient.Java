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

public interface ConvertDataApi {
  /**
   * CSV to JSON conversion
   * Convert a CSV file to a JSON object array
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;Object&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/csv/to/json")
  Call<Object> convertDataCsvToJson(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

  /**
   * XML to JSON conversion
   * Convert an XML string or file into JSON
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;Object&gt;
   */
  @retrofit2.http.Multipart
  @POST("convert/xml/to/json")
  Call<Object> convertDataXmlToJson(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

}
