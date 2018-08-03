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

public interface ArtisticApi {
  /**
   * Transform an image into an artistic painting automatically
   * Uses machine learning to automatically transform an image into an artistic painting.  Due to depth of AI processing, depending on image size this operation can take up to 20 seconds.
   * @param style The style of the painting to apply.  To start, try \&quot;udnie\&quot; a modernist\&quot; painting style.  Possible values are: \&quot;udnie\&quot;, \&quot;wave\&quot;, \&quot;la_muse\&quot;, \&quot;rain_princess\&quot;. (required)
   * @param imageFile Image file to perform the operation on.  Common file formats such as PNG, JPEG are supported. (required)
   * @return Call&lt;Object&gt;
   */
  @retrofit2.http.Multipart
  @POST("image/artistic/painting/{style}")
  Call<Object> artisticPainting(
    @retrofit2.http.Path("style") String style, @retrofit2.http.Part("imageFile\"; filename=\"imageFile") RequestBody imageFile
  );

}
