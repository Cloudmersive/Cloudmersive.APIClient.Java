package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.CheckJsonResponse;
import com.cloudmersive.client.model.CheckSentenceJsonResponse;
import com.cloudmersive.client.model.CorrectJsonResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for SpellCheckApi
 */
public class SpellCheckApiTest {

    private SpellCheckApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(SpellCheckApi.class);
    }

    /**
     * Spell check word
     *
     * Spell check a word as JSON
     */
    @Test
    public void spellCheckCheckJsonTest() {
        String value = null;
        // CheckJsonResponse response = api.spellCheckCheckJson(value);

        // TODO: test validations
    }
    /**
     * Check if sentence is spelled correctly
     *
     * Checks whether the sentence is spelled correctly and returns the result as JSON
     */
    @Test
    public void spellCheckCheckSentenceJsonTest() {
        String value = null;
        // CheckSentenceJsonResponse response = api.spellCheckCheckSentenceJson(value);

        // TODO: test validations
    }
    /**
     * Spell check a sentence
     *
     * Check if a sentence is spelled correctly
     */
    @Test
    public void spellCheckCheckSentenceStringTest() {
        String value = null;
        // Boolean response = api.spellCheckCheckSentenceString(value);

        // TODO: test validations
    }
    /**
     * Find spelling corrections
     *
     * Find the spelling corrections for a word
     */
    @Test
    public void spellCheckCorrectTest() {
        String value = null;
        // String response = api.spellCheckCorrect(value);

        // TODO: test validations
    }
    /**
     * Find spelling corrections
     *
     * Find spelling correction suggestions and return result as JSON
     */
    @Test
    public void spellCheckCorrectJsonTest() {
        String value = null;
        // CorrectJsonResponse response = api.spellCheckCorrectJson(value);

        // TODO: test validations
    }
    /**
     * Spell check a word
     *
     * Check if a word is spelled correctly
     */
    @Test
    public void spellCheckPostTest() {
        String value = null;
        // Boolean response = api.spellCheckPost(value);

        // TODO: test validations
    }
}
