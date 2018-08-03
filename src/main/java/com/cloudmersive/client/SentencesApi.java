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

public interface SentencesApi {
  /**
   * Extract sentences from string
   * Segment an input string into separate sentences, output result as a string.
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/sentences/string")
  Call<String> sentencesPost(
    @retrofit2.http.Body String input
  );

}
