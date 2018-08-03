package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.CheckJsonResponse;
import com.cloudmersive.client.model.CheckSentenceJsonResponse;
import com.cloudmersive.client.model.CorrectJsonResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface SpellCheckApi {
  /**
   * Spell check word
   * Spell check a word as JSON
   * @param value Input sentence (required)
   * @return Call&lt;CheckJsonResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/spellcheck/check/word/json")
  Call<CheckJsonResponse> spellCheckCheckJson(
    @retrofit2.http.Body String value
  );

  /**
   * Check if sentence is spelled correctly
   * Checks whether the sentence is spelled correctly and returns the result as JSON
   * @param value Input sentence (required)
   * @return Call&lt;CheckSentenceJsonResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/spellcheck/check/sentence/json")
  Call<CheckSentenceJsonResponse> spellCheckCheckSentenceJson(
    @retrofit2.http.Body String value
  );

  /**
   * Spell check a sentence
   * Check if a sentence is spelled correctly
   * @param value Input sentence word (required)
   * @return Call&lt;Boolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/spellcheck/check/sentence/string")
  Call<Boolean> spellCheckCheckSentenceString(
    @retrofit2.http.Body String value
  );

  /**
   * Find spelling corrections
   * Find the spelling corrections for a word
   * @param value Input word (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/spellcheck/correct/word/string")
  Call<String> spellCheckCorrect(
    @retrofit2.http.Body String value
  );

  /**
   * Find spelling corrections
   * Find spelling correction suggestions and return result as JSON
   * @param value Input string (required)
   * @return Call&lt;CorrectJsonResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/spellcheck/correct/word/json")
  Call<CorrectJsonResponse> spellCheckCorrectJson(
    @retrofit2.http.Body String value
  );

  /**
   * Spell check a word
   * Check if a word is spelled correctly
   * @param value Input string word (required)
   * @return Call&lt;Boolean&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/spellcheck/check/word/string")
  Call<Boolean> spellCheckPost(
    @retrofit2.http.Body String value
  );

}
