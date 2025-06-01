package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.invoker.Configuration;
import com.cloudmersive.client.invoker.auth.ApiKeyAuth;
import com.cloudmersive.client.model.VirusScanAdvancedResult;
import java.io.FileInputStream;
import java.io.InputStream;
import org.junit.Test;

/**
 * Example unit test demonstrating how to scan a file from an InputStream.
 */
public class ScanApiInputStreamTest {

    @Test
    public void scanHelloZipAdvanced() throws Exception {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        apikey.setApiKey("YOUR_API_KEY");

        ScanApi api = new ScanApi();

        try (InputStream input = new FileInputStream("D:\\temp\\hello.zip")) {
            VirusScanAdvancedResult result = api.scanFileAdvanced(
                input,
                "hello.zip",
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null,
                null);
            System.out.println(result);
        }
    }
}
