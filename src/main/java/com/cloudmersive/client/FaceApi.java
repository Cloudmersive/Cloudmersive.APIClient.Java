package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.AgeDetectionResult;
import com.cloudmersive.client.model.FaceLocateResponse;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface FaceApi {
  /**
   * Crop image to face (square)
   * Crop an image to the face (rectangular crop).  If there is more than one face present, choose the first one.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;Object&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/face/crop/first")
  Call<Object> faceCropFirst(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

  /**
   * Crop image to face (round)
   * Crop an image to the face (circular/round crop).  If there is more than one face present, choose the first one.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;Object&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/face/crop/first/round")
  Call<Object> faceCropFirstRound(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

  /**
   * Detect the age of people in an image
   * Identify the age, position, and size of human faces in an image, along with a recognition confidence level.  People in the image do NOT need to be facing the camera; they can be facing away, edge-on, etc.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;AgeDetectionResult&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/face/detect-age")
  Call<AgeDetectionResult> faceDetectAge(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

  /**
   * Find faces in an image
   * Locate the positions of all faces in an image
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;FaceLocateResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/face/locate")
  Call<FaceLocateResponse> faceLocate(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

}
