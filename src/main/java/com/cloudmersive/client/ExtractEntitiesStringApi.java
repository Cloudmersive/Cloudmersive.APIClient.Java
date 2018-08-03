package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ExtractEntitiesStringApi {
  /**
   * Extract entities from string
   * Extract the named entitites from an input string.
   * @param value Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/ExtractEntitiesString")
  Call<String> extractEntitiesStringPost(
    @retrofit2.http.Body String value
  );

}
