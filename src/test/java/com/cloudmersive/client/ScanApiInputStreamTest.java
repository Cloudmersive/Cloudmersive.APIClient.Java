package com.cloudmersive.client;

import com.cloudmersive.client.invoker.*;
import com.cloudmersive.client.invoker.auth.*;
import com.cloudmersive.client.model.*;
import java.io.FileInputStream;
import java.io.InputStream;
import org.junit.Test;

import com.squareup.okhttp.Call;
import com.squareup.okhttp.Response;


/**
 * Example unit test demonstrating how to scan a file from an InputStream.
 */
public class ScanApiInputStreamTest {

    @Test
    public void scanHelloZipAdvanced() throws Exception {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        //defaultClient.addDefaultHeader("Transfer-Encoding", "chunked");

        ApiKeyAuth apikey = (ApiKeyAuth) defaultClient.getAuthentication("Apikey");
        apikey.setApiKey("29f103b8-79ed-4e41-af4f-be8630bdab3a");

        defaultClient.setBasePath(//"http://jnj-pp-managed-instance.cloudmersive.io:7075" 
        //"http://15.204.12.85:7075" // "https://authlogging.cloudmersiveproxy.io"  
        "https://jnj-pp-managed-instance.cloudmersive.io"
        //"https://devmi2.cloudmersive.io"
        );


defaultClient.setReadTimeout(0);           // unlimited
defaultClient.setWriteTimeout(0);          // unlimited
defaultClient.setConnectTimeout(3000000);

        ScanApi api = new ScanApi();

        try (InputStream input = new FileInputStream(
            //"C:\\temp\\hello.txt"
            "Z:\\Hashan_Seneviratne_7gbFile.zip"
        )) {
            VirusScanAdvancedResult result = api.scanFileAdvanced(
        input,
        "hello.zip",
        true,   // allowExecutables
        true,   // allowInvalidFiles
        true,   // allowScripts
        true,   // allowPasswordProtectedFiles
        true,   // allowMacros
        true,   // allowXmlExternalEntities
        true,   // allowInsecureDeserialization
        true,   // allowHtml
        true,   // allowUnsafeArchives
        true,   // allowOleEmbeddedObject  <-- new argument
        null,   // options
        null    // restrictFileTypes
);


            System.out.println(result.toString());
        }
    }
}
