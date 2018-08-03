package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.LanguageDetectionResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for LanguageDetectionApi
 */
public class LanguageDetectionApiTest {

    private LanguageDetectionApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(LanguageDetectionApi.class);
    }

    /**
     * Detect language of text
     *
     * Automatically determine which language a text string is written in.  Supports Danish (DAN), German (DEU), English (ENG), French (FRA), Italian (ITA), Japanese (JPN), Korean (KOR), Dutch (NLD), Norwegian (NOR), Portuguese (POR), Russian (RUS), Spanish (SPA), Swedish (SWE), Chinese (ZHO).
     */
    @Test
    public void languageDetectionPostTest() {
        String textToDetect = null;
        // LanguageDetectionResponse response = api.languageDetectionPost(textToDetect);

        // TODO: test validations
    }
}
