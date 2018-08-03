package com.cloudmersive.client;

import com.cloudmersive.client.invoker.CollectionFormats.*;

import retrofit2.Call;
import retrofit2.http.*;

import okhttp3.RequestBody;
import okhttp3.ResponseBody;

import java.io.File;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public interface GenerateBarcodeApi {
  /**
   * Validates and generate a EAN-13 barcode as a PNG file, a type of 1D barcode
   * 
   * @param value Barcode value to generate from (required)
   * @return Call&lt;File&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("barcode/generate/ean-13")
  Call<ResponseBody> generateBarcodeEAN13(
    @retrofit2.http.Body String value
  );

  /**
   * Validates and generate a EAN-8 barcode as a PNG file, a type of 1D barcode
   * 
   * @param value Barcode value to generate from (required)
   * @return Call&lt;File&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("barcode/generate/ean-8")
  Call<ResponseBody> generateBarcodeEAN8(
    @retrofit2.http.Body String value
  );

  /**
   * Generate a QR code barcode as a PNG file, a type of 2D barcode which can encode free-form text information
   * 
   * @param value QR code text to convert into the QR code barcode (required)
   * @return Call&lt;File&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("barcode/generate/qrcode")
  Call<ResponseBody> generateBarcodeQRCode(
    @retrofit2.http.Body String value
  );

  /**
   * Validate and generate a UPC-A barcode as a PNG file, a type of 1D barcode
   * 
   * @param value UPC-A barcode value to generate from (required)
   * @return Call&lt;File&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("barcode/generate/upc-a")
  Call<ResponseBody> generateBarcodeUPCA(
    @retrofit2.http.Body String value
  );

  /**
   * Validates and generate a UPC-E barcode as a PNG file, a type of 1D barcode
   * 
   * @param value UPC-E barcode value to generate from (required)
   * @return Call&lt;File&gt;
   */
  @Headers({
    "Content-Type:application/json"
  })
  @POST("barcode/generate/upc-e")
  Call<ResponseBody> generateBarcodeUPCE(
    @retrofit2.http.Body String value
  );

}
