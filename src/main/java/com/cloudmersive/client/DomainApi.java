package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.CheckResponse;
import com.cloudmersive.client.model.WhoisResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface DomainApi {
  /**
   * Validate a domain name
   * Check whether a domain name is valid or not.  API performs a live validation by contacting DNS services to validate the existence of the domain name.
   * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.  The input is a string so be sure to enclose it in double-quotes. (required)
   * @return Call&lt;CheckResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("validate/domain/check")
  Call<CheckResponse> domainCheck(
    @retrofit2.http.Body String domain
  );

  /**
   * Get WHOIS information for a domain
   * Validate whether a domain name exists, and also return the full WHOIS record for that domain name.  WHOIS records include all the registration details of the domain name, such as information about the domain&#39;s owners.
   * @param domain Domain name to check, for example \&quot;cloudmersive.com\&quot;.   The input is a string so be sure to enclose it in double-quotes. (required)
   * @return Call&lt;WhoisResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("validate/domain/whois")
  Call<WhoisResponse> domainPost(
    @retrofit2.http.Body String domain
  );

}
