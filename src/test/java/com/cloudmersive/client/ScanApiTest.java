package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import java.io.File;
import com.cloudmersive.client.model.VirusScanResult;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScanApi
 */
public class ScanApiTest {

    private ScanApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ScanApi.class);
    }

    /**
     * Scan a file for viruses
     *
     * 
     */
    @Test
    public void scanFileTest() {
        File inputFile = null;
        // VirusScanResult response = api.scanFile(inputFile);

        // TODO: test validations
    }
}
