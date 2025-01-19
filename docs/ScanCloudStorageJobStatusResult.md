
# ScanCloudStorageJobStatusResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | Tru eif the operation to check the status of the job was successful, false otherwise |  [optional]
**asyncJobStatus** | **String** | Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED |  [optional]
**asyncJobID** | **String** | Job ID of the async batch job |  [optional]
**result** | [**CloudStorageAdvancedVirusScanResult**](CloudStorageAdvancedVirusScanResult.md) | Output scan result, if applicable |  [optional]
**errorMessage** | **String** | Error message (if any) |  [optional]



