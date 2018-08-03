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

public interface ParseStringApi {
  /**
   * Parse string to syntax tree
   * Parses the input string into a Penn Treebank syntax tree
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/ParseString")
  Call<String> parseStringPost(
    @retrofit2.http.Body String input
  );

}
