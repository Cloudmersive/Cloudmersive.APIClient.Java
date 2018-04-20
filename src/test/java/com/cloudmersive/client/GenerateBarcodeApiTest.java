/*
 * barcodeapi
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GenerateBarcodeApi
 */
@Ignore
public class GenerateBarcodeApiTest {

    private final GenerateBarcodeApi api = new GenerateBarcodeApi();

    
    /**
     * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeEAN13Test() {
        String value = null;
        api.generateBarcodeEAN13(value);

        // TODO: test validations
    }
    
    /**
     * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeEAN8Test() {
        String value = null;
        api.generateBarcodeEAN8(value);

        // TODO: test validations
    }
    
    /**
     * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeQRCodeTest() {
        String value = null;
        api.generateBarcodeQRCode(value);

        // TODO: test validations
    }
    
    /**
     * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeUPCATest() {
        String value = null;
        api.generateBarcodeUPCA(value);

        // TODO: test validations
    }
    
    /**
     * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void generateBarcodeUPCETest() {
        String value = null;
        api.generateBarcodeUPCE(value);

        // TODO: test validations
    }
    
}
