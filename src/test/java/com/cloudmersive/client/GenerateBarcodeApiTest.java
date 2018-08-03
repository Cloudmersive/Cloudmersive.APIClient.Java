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
 * API tests for GenerateBarcodeApi
 */
public class GenerateBarcodeApiTest {

    private GenerateBarcodeApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(GenerateBarcodeApi.class);
    }

    /**
     * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
     *
     * 
     */
    @Test
    public void generateBarcodeEAN13Test() {
        String value = null;
        // File response = api.generateBarcodeEAN13(value);

        // TODO: test validations
    }
    /**
     * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
     *
     * 
     */
    @Test
    public void generateBarcodeEAN8Test() {
        String value = null;
        // File response = api.generateBarcodeEAN8(value);

        // TODO: test validations
    }
    /**
     * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
     *
     * 
     */
    @Test
    public void generateBarcodeQRCodeTest() {
        String value = null;
        // File response = api.generateBarcodeQRCode(value);

        // TODO: test validations
    }
    /**
     * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
     *
     * 
     */
    @Test
    public void generateBarcodeUPCATest() {
        String value = null;
        // File response = api.generateBarcodeUPCA(value);

        // TODO: test validations
    }
    /**
     * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
     *
     * 
     */
    @Test
    public void generateBarcodeUPCETest() {
        String value = null;
        // File response = api.generateBarcodeUPCE(value);

        // TODO: test validations
    }
}
