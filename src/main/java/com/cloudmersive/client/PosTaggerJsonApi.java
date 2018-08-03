package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.PosRequest;
import com.cloudmersive.client.model.PosResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface PosTaggerJsonApi {
  /**
   * Part-of-speech tag a string
   * Part-of-speech (POS) tag a string and return result as JSON
   * @param request Input string (required)
   * @return Call&lt;PosResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/PosTaggerJson")
  Call<PosResponse> posTaggerJsonPost(
    @retrofit2.http.Body PosRequest request
  );

}
