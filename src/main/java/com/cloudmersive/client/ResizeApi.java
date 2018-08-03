package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ResizeApi {
  /**
   * Resize an image with parameters
   * Resize an image to a maximum width and maximum height, while preserving the image&#39;s original aspect ratio
   * @param maxWidth Maximum width of the output image - final image will be as large as possible while less than or equial to this width (required)
   * @param maxHeight Maximum height of the output image - final image will be as large as possible while less than or equial to this height (required)
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;Object&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/resize/preserveAspectRatio/{maxWidth}/{maxHeight}")
  Call<Object> resizePost(
    @retrofit2.http.Path("maxWidth") Integer maxWidth, @retrofit2.http.Path("maxHeight") Integer maxHeight, @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

}
