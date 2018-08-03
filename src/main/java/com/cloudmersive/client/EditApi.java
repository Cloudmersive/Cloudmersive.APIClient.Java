package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.DrawRectangleRequest;
import com.cloudmersive.client.model.DrawTextRequest;
import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EditApi {
  /**
   * Composite two images together
   * Composites two input images together; a layered image onto a base image.  The first image you input is the base image.  The second image (the layered image) will be composited on top of this base image.  Supports PNG transparency.  To control padding you can include transparent pixels at the border(s) of your layered images as appropriate.
   * @param location Location to composite the layered images; possible values are: \&quot;center\&quot;, \&quot;top-left\&quot;, \&quot;top-center\&quot;, \&quot;top-right\&quot;, \&quot;center-left\&quot;, \&quot;center-right\&quot;, \&quot;bottom-left\&quot;, \&quot;bottom-center\&quot;, \&quot;bottom-right\&quot; (required)
   * @param baseImage Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @param layeredImage Image to layer on top of the base image. (required)
   * @return Call&lt;Object&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/edit/composite/{location}")
  Call<Object> editCompositeBasic(
    @retrofit2.http.Path("location") String location, @retrofit2.http.Part("baseImage\"; filename=\"baseImage") RequestBody baseImage, @retrofit2.http.Part("layeredImage\"; filename=\"layeredImage") RequestBody layeredImage
  );

  /**
   * Draw rectangle onto an image
   * Draw one or more rectangles, with customized visuals, onto an image
   * @param request  (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("image/edit/draw/rectangle")
  Call<Object> editDrawRectangle(
    @retrofit2.http.Body DrawRectangleRequest request
  );

  /**
   * Draw text onto an image
   * Draw one or more pieces of text, with customized visuals, onto an image
   * @param request  (required)
   * @return Call&lt;Object&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("image/edit/draw/text")
  Call<Object> editDrawText(
    @retrofit2.http.Body DrawTextRequest request
  );

}
