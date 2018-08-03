package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import com.cloudmersive.client.model.AddressGetServersResponse;
import com.cloudmersive.client.model.AddressVerifySyntaxOnlyResponse;
import com.cloudmersive.client.model.FullEmailValidationResponse;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface EmailApi {
  /**
   * Partially check whether an email address is valid
   * Validate an email address by identifying whether its parent domain has email servers defined.  This call is less limited than syntaxOnly but not as comprehensive as address/full.
   * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
   * @return Call&lt;AddressGetServersResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("validate/email/address/servers")
  Call<AddressGetServersResponse> emailAddressGetServers(
    @retrofit2.http.Body String email
  );

  /**
   * Fully validate an email address
   * Performs a full validation of the email address.  Checks for syntactic correctness, identifies the mail server in question if any, and then contacts the email server to validate the existence of the account - without sending any emails.
   * @param email Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
   * @return Call&lt;FullEmailValidationResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("validate/email/address/full")
  Call<FullEmailValidationResponse> emailFullValidation(
    @retrofit2.http.Body String email
  );

  /**
   * Validate email adddress for syntactic correctness only
   * Validate whether a given email address is syntactically correct via a limited local-only check.  Use the address/full API to do a full validation.
   * @param value Email address to validate, e.g. \&quot;support@cloudmersive.com\&quot;.    The input is a string so be sure to enclose it in double-quotes. (required)
   * @return Call&lt;AddressVerifySyntaxOnlyResponse&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("validate/email/address/syntaxOnly")
  Call<AddressVerifySyntaxOnlyResponse> emailPost(
    @retrofit2.http.Body String value
  );

}
