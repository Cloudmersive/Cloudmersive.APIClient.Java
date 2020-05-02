/*
 * nlpapiv2
 * The powerful Natural Language Processing APIs (v2) let you perform part of speech tagging, entity identification, sentence parsing, and much more to help you understand the meaning of unstructured text.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.model.LanguageTranslationRequest;
import com.cloudmersive.client.model.LanguageTranslationResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LanguageTranslationApi
 */
@Ignore
public class LanguageTranslationApiTest {

    private final LanguageTranslationApi api = new LanguageTranslationApi();

    
    /**
     * Translate German to English text with Deep Learning AI
     *
     * Automatically translates input text in German to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void languageTranslationTranslateDeuToEngTest() throws ApiException {
        LanguageTranslationRequest input = null;
        LanguageTranslationResponse response = api.languageTranslationTranslateDeuToEng(input);

        // TODO: test validations
    }
    
    /**
     * Translate English to German text with Deep Learning AI
     *
     * Automatically translates input text in English to output text in German using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void languageTranslationTranslateEngToDeuTest() throws ApiException {
        LanguageTranslationRequest input = null;
        LanguageTranslationResponse response = api.languageTranslationTranslateEngToDeu(input);

        // TODO: test validations
    }
    
    /**
     * Translate English to Russian text with Deep Learning AI
     *
     * Automatically translates input text in English to output text in Russian using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void languageTranslationTranslateEngToRusTest() throws ApiException {
        LanguageTranslationRequest input = null;
        LanguageTranslationResponse response = api.languageTranslationTranslateEngToRus(input);

        // TODO: test validations
    }
    
    /**
     * Translate Russian to English text with Deep Learning AI
     *
     * Automatically translates input text in Russian to output text in English using advanced Deep Learning and Neural NLP.  Consumes 1-2 API calls per input sentence.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void languageTranslationTranslateRusToEngTest() throws ApiException {
        LanguageTranslationRequest input = null;
        LanguageTranslationResponse response = api.languageTranslationTranslateRusToEng(input);

        // TODO: test validations
    }
    
}
