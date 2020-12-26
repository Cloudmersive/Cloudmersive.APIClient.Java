/*
 * virusapi
 * The Cloudmersive Virus Scan API lets you scan files and content for viruses and identify security issues with content.
 *
 * OpenAPI spec version: v1
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.cloudmersive.client;

import com.cloudmersive.client.invoker.ApiException;
import com.cloudmersive.client.model.CloudStorageVirusScanResult;
import java.io.File;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ScanCloudStorageApi
 */
@Ignore
public class ScanCloudStorageApiTest {

    private final ScanCloudStorageApi api = new ScanCloudStorageApi();

    
    /**
     * Scan an AWS S3 file for viruses
     *
     * Scan the contents of a single AWS S3 file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanAwsS3FileTest() throws ApiException {
        String accessKey = null;
        String secretKey = null;
        String bucketRegion = null;
        String bucketName = null;
        String keyName = null;
        CloudStorageVirusScanResult response = api.scanCloudStorageScanAwsS3File(accessKey, secretKey, bucketRegion, bucketName, keyName);

        // TODO: test validations
    }
    
    /**
     * Scan an Azure Blob for viruses
     *
     * Scan the contents of a single Azure Blob and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanAzureBlobTest() throws ApiException {
        String connectionString = null;
        String containerName = null;
        String blobPath = null;
        CloudStorageVirusScanResult response = api.scanCloudStorageScanAzureBlob(connectionString, containerName, blobPath);

        // TODO: test validations
    }
    
    /**
     * Scan an Google Cloud Platform (GCP) Storage file for viruses
     *
     * Scan the contents of a single Google Cloud Platform (GCP) Storage file and its content for viruses. Leverage continuously updated signatures for millions of threats, and advanced high-performance scanning capabilities.  Over 17 million virus and malware signatures.  Continuous cloud-based updates.  Wide file format support including Office, PDF, HTML, Flash.  Zip support including .Zip, .Rar, .DMG, .Tar, and other archive formats.  Multi-threat scanning across viruses, malware, trojans, ransomware, and spyware.  High-speed in-memory scanning delivers subsecond typical response time.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void scanCloudStorageScanGcpStorageFileTest() throws ApiException {
        String bucketName = null;
        String objectName = null;
        File jsonCredentialFile = null;
        CloudStorageVirusScanResult response = api.scanCloudStorageScanGcpStorageFile(bucketName, objectName, jsonCredentialFile);

        // TODO: test validations
    }
    
}
