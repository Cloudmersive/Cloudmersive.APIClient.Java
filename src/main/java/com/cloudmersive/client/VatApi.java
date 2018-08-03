package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.VatLookupRequest;
import com.cloudmersive.client.model.VatLookupResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface VatApi {
  /**
   * Lookup a VAT code
   * Checks if a VAT code is valid, and if it is, returns more information about it
   * @param input Input VAT code (required)
   * @return Call&lt;VatLookupResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("validate/vat/lookup")
  Call<VatLookupResponse> vatVatLookup(
    @retrofit2.http.Body VatLookupRequest input
  );

}
