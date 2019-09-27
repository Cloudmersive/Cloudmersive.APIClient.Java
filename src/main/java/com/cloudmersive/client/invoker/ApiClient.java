package com.cloudmersive;

import com.cloudmersive.client.*;
import com.cloudmersive.client.model.*;
import com.cloudmersive.client.invoker.*;
import com.cloudmersive.client.invoker.auth.*;
import java.io.*;
import com.cloudmersive.client.ScanApi;

public class Main {

    public static void main(String[] args) {
        ApiClient client = new ApiClient();
        client.addDefaultHeader("Apikey", "14343416-776b-40e8-b6d7-6ffaa0bd70f9");



//        ApiKeyAuth auth = (ApiKeyAuth)client.getAuthentication("key");
//        auth.setApiKey("14343416-776b-40e8-b6d7-6ffaa0bd70f9");

//        ApiKeyAuth auth = new ApiKeyAuth("header", "Apikey");
//        auth.setApiKey("14343416-776b-40e8-b6d7-6ffaa0bd70f9");
//
//        client.getAuthentications().put("Apikey", auth);

        //client.setApiKey("14343416-776b-40e8-b6d7-6ffaa0bd70f9");




        try
        {
            // Customer

            ApiClient defaultClient = Configuration.getDefaultApiClient();
            defaultClient.setConnectTimeout(300000);
            defaultClient.setReadTimeout(300000);
            defaultClient.setWriteTimeout(300000);

            // Configure API key authorization: Apikey
            ApiKeyAuth Apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
            Apikey.setApiKey("YOUR-API-KEY-HERE");


        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Apikey.setApiKeyPrefix("Token");

        ScanApi apiInstance = new ScanApi();
        File inputFile = new File("C:\\temp\\test.exe"); // File | Input file to perform the operation on.
        try {
            VirusScanResult result = apiInstance.scanFile(inputFile);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScanApi#scanFile");
            e.printStackTrace();
        }


        }
        catch (Exception e)
        {
            System.out.println("Error:" + e.toString() + e.getMessage() );
        }




    }
}
