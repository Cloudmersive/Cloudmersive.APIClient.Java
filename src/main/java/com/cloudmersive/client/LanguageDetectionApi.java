package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.LanguageDetectionResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface LanguageDetectionApi {
  /**
   * Detect language of text
   * Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).
   * @param textToDetect Text to detect language of (required)
   * @return Call&lt;LanguageDetectionResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/language/detect")
  Call<LanguageDetectionResponse> languageDetectionPost(
    @retrofit2.http.Body String textToDetect
  );

}
