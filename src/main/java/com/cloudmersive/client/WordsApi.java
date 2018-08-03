package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.GetWordsJsonResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface WordsApi {
  /**
   * Get adjectives in string
   * Retrieves all adjectives in input string
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/adjectives/string")
  Call<String> wordsAdjectives(
    @retrofit2.http.Body String input
  );

  /**
   * Get adverbs in input string
   * Returns all adverb words in the input string
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/adverbs/string")
  Call<String> wordsAdverbs(
    @retrofit2.http.Body String input
  );

  /**
   * Get words in input string (JSON)
   * Get the component words in an input string, formatted as JSON
   * @param input String to process (required)
   * @return Call&lt;GetWordsJsonResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/json")
  Call<GetWordsJsonResponse> wordsGetWordsJson(
    @retrofit2.http.Body String input
  );

  /**
   * Get words from string
   * Segment an input string into its component words
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/string")
  Call<String> wordsGetWordsString(
    @retrofit2.http.Body String input
  );

  /**
   * Get nouns in string
   * Returns all of the nouns in the input string
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/nouns/string")
  Call<String> wordsNouns(
    @retrofit2.http.Body String input
  );

  /**
   * Get the verbs in a string
   * Get all of the verbs in the input string.
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/verbs/string")
  Call<String> wordsPost(
    @retrofit2.http.Body String input
  );

  /**
   * Returns all pronounts in string
   * Returns all pronouns in the input string
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/pronouns/string")
  Call<String> wordsPronouns(
    @retrofit2.http.Body String input
  );

  /**
   * Get proper nouns in a string
   * Returns all of the proper nouns in a string.  Proper nouns are named entities such as \&quot;Hilton\&quot;.
   * @param input Input string (required)
   * @return Call&lt;String&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("nlp/get/words/properNouns/string")
  Call<String> wordsProperNouns(
    @retrofit2.http.Body String input
  );

}
