package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import java.io.File;
import com.cloudmersive.client.model.ImageDescriptionResponse;
import com.cloudmersive.client.model.ObjectDetectionResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for RecognizeApi
 */
public class RecognizeApiTest {

    private RecognizeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(RecognizeApi.class);
    }

    /**
     * Describe an image in natural language
     *
     * Generate an English language text description of the image as a sentence.
     */
    @Test
    public void recognizeDescribeTest() {
        File imageFile = null;
        // ImageDescriptionResponse response = api.recognizeDescribe(imageFile);

        // TODO: test validations
    }
    /**
     * Detect objects, including types and locations, in an image
     *
     * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
     */
    @Test
    public void recognizeDetectObjectsTest() {
        File imageFile = null;
        // ObjectDetectionResult response = api.recognizeDetectObjects(imageFile);

        // TODO: test validations
    }
    /**
     * Detect people, including locations, in an image
     *
     * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     */
    @Test
    public void recognizeDetectPeopleTest() {
        File imageFile = null;
        // ObjectDetectionResult response = api.recognizeDetectPeople(imageFile);

        // TODO: test validations
    }
}
