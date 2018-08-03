package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;
import com.cloudmersive.client.model.NsfwResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface NsfwApi {
  /**
   * Not safe for work (NSFW) racy content classification
   * Classify an image into Not Safe For Work (NSFW)/Porn/Racy content and Safe Content.
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;NsfwResult&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/nsfw/classify")
  Call<NsfwResult> nsfwClassify(
    @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

}
