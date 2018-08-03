package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;
import com.cloudmersive.client.model.ImageDescriptionResponse;
import com.cloudmersive.client.model.ObjectDetectionResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface RecognizeApi {
  /**
   * Describe an image in natural language
   * Generate an English language text description of the image as a sentence.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;ImageDescriptionResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/recognize/describe")
  Call<ImageDescriptionResponse> recognizeDescribe(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

  /**
   * Detect objects, including types and locations, in an image
   * Identify the position, size and description of objects in an image, along with a recognition confidence level.  Detects both human people and objects in an image.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;ObjectDetectionResult&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/recognize/detect-objects")
  Call<ObjectDetectionResult> recognizeDetectObjects(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

  /**
   * Detect people, including locations, in an image
   * Identify the position, and size of human people in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;ObjectDetectionResult&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/recognize/detect-people")
  Call<ObjectDetectionResult> recognizeDetectPeople(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

}
