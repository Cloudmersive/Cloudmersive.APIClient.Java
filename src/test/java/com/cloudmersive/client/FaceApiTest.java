package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.model.AgeDetectionResult;
import com.cloudmersive.client.model.FaceLocateResponse;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for FaceApi
 */
public class FaceApiTest {

    private FaceApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(FaceApi.class);
    }

    /**
     * Crop image to face (square)
     *
     * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
     */
    @Test
    public void faceCropFirstTest() {
        File imageFile = null;
        // Object response = api.faceCropFirst(imageFile);

        // TODO: test validations
    }
    /**
     * Crop image to face (round)
     *
     * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
     */
    @Test
    public void faceCropFirstRoundTest() {
        File imageFile = null;
        // Object response = api.faceCropFirstRound(imageFile);

        // TODO: test validations
    }
    /**
     * Detect the age of people in an image
     *
     * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
     */
    @Test
    public void faceDetectAgeTest() {
        File imageFile = null;
        // AgeDetectionResult response = api.faceDetectAge(imageFile);

        // TODO: test validations
    }
    /**
     * Find faces in an image
     *
     * Locate the positions of all faces in an image
     */
    @Test
    public void faceLocateTest() {
        File imageFile = null;
        // FaceLocateResponse response = api.faceLocate(imageFile);

        // TODO: test validations
    }
}
