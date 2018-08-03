package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.GetWordsJsonResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for WordsApi
 */
public class WordsApiTest {

    private WordsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(WordsApi.class);
    }

    /**
     * Get adjectives in string
     *
     * Retrieves all adjectives in input string
     */
    @Test
    public void wordsAdjectivesTest() {
        String input = null;
        // String response = api.wordsAdjectives(input);

        // TODO: test validations
    }
    /**
     * Get adverbs in input string
     *
     * Returns all adverb words in the input string
     */
    @Test
    public void wordsAdverbsTest() {
        String input = null;
        // String response = api.wordsAdverbs(input);

        // TODO: test validations
    }
    /**
     * Get words in input string (JSON)
     *
     * Get the component words in an input string, formatted as JSON
     */
    @Test
    public void wordsGetWordsJsonTest() {
        String input = null;
        // GetWordsJsonResponse response = api.wordsGetWordsJson(input);

        // TODO: test validations
    }
    /**
     * Get words from string
     *
     * Segment an input string into its component words
     */
    @Test
    public void wordsGetWordsStringTest() {
        String input = null;
        // String response = api.wordsGetWordsString(input);

        // TODO: test validations
    }
    /**
     * Get nouns in string
     *
     * Returns all of the nouns in the input string
     */
    @Test
    public void wordsNounsTest() {
        String input = null;
        // String response = api.wordsNouns(input);

        // TODO: test validations
    }
    /**
     * Get the verbs in a string
     *
     * Get all of the verbs in the input string.
     */
    @Test
    public void wordsPostTest() {
        String input = null;
        // String response = api.wordsPost(input);

        // TODO: test validations
    }
    /**
     * Returns all pronounts in string
     *
     * Returns all pronouns in the input string
     */
    @Test
    public void wordsPronounsTest() {
        String input = null;
        // String response = api.wordsPronouns(input);

        // TODO: test validations
    }
    /**
     * Get proper nouns in a string
     *
     * Returns all of the proper nouns in a string.  Proper nouns are named entities such as \&quot;Hilton\&quot;.
     */
    @Test
    public void wordsProperNounsTest() {
        String input = null;
        // String response = api.wordsProperNouns(input);

        // TODO: test validations
    }
}
