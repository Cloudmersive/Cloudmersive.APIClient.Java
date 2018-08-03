package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.BarcodeLookupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface BarcodeLookupApi {
  /**
   * Lookup a barcode value and return product data
   * 
   * @param value Barcode value (required)
   * @return Call&lt;BarcodeLookupResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("barcode/lookup/ean")
  Call<BarcodeLookupResponse> barcodeLookupEanLookup(
    @retrofit2.http.Body String value
  );

}
