
# PdfToTextResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if successful, false otherwise |  [optional]
**ocrPages** | [**List&lt;OcrPageResult&gt;**](OcrPageResult.md) | Page OCR results |  [optional]
**asyncJobID** | **String** | When the job exceeds 25 pages, an Async Job ID is returned.  Use the CheckPdfOcrJobStatus API to check on the status of this job using the AsyncJobID and get the result when it finishes |  [optional]
**asyncJobStatus** | **String** | Returns the job status of the Async Job, if applicable.  Possible states are STARTED and COMPLETED |  [optional]



