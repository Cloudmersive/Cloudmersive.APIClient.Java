package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;
import com.cloudmersive.client.model.VirusScanResult;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface ScanApi {
  /**
   * Scan a file for viruses
   * 
   * @param inputFile Input file to perform the operation on. (required)
   * @return Call&lt;VirusScanResult&gt;
   */
  @retrofit2.http.Multipart
  @POST("virus/scan/file")
  Call<VirusScanResult> scanFile(
    @retrofit2.http.Part("inputFile\"; filename=\"inputFile") RequestBody inputFile
  );

}
