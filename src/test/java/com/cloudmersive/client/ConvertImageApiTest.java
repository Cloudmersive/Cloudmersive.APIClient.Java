package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiClient;
import java.io.File;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ConvertImageApi
 */
public class ConvertImageApiTest {

    private ConvertImageApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(ConvertImageApi.class);
    }

    /**
     * Image format conversion
     *
     * Convert between over 100 file formats, including key formats such as Photoshop (PSD), PNG, JPG, GIF, NEF, and BMP.
     */
    @Test
    public void convertImageImageFormatConvertTest() {
        String format1 = null;
        String format2 = null;
        File inputFile = null;
        // byte[] response = api.convertImageImageFormatConvert(format1, format2, inputFile);

        // TODO: test validations
    }
}
