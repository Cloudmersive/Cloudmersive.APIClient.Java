package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;
import com.cloudmersive.client.model.ImageToTextResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ImageOcrApi {
  /**
   * Converts an uploaded image in common formats such as JPEG, PNG into text via Optical Character Recognition.
   * 
   * @param imageFile Image file to perform OCR on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;ImageToTextResponse&gt;
   */
  @retrofit2.http.Multipart
  @POST("ocr/image/toText")
  Call<ImageToTextResponse> imageOcrPost(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

}
