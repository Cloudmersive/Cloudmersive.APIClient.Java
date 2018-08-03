package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.GeolocateResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface IpAddressApi {
  /**
   * Geolocate an IP address
   * Identify an IP address Country, State/Provence, City, Zip/Postal Code, etc.  Useful for security and UX applications.
   * @param value IP address to geolocate, e.g. \&quot;55.55.55.55\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return Call&lt;GeolocateResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("validate/ip/geolocate")
  Call<GeolocateResponse> iPAddressPost(
    @retrofit2.http.Body String value
  );

}
