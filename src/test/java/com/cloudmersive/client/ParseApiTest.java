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

import com.cloudmersive.client.model.ParseRequest;
import com.cloudmersive.client.model.ParseResponse;
import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ParseApi
 */
@Ignore
public class ParseApiTest {

    private final ParseApi api = new ParseApi();

    
    /**
     * Parse string to syntax tree
     *
     * Parses the input string into a Penn Treebank syntax tree
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void parseParseStringTest() throws Exception {
        ParseRequest input = null;
        ParseResponse response = api.parseParseString(input);

        // TODO: test validations
    }
    
}
