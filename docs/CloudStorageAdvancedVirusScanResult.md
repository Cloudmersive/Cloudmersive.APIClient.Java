
# CloudStorageAdvancedVirusScanResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation of retrieving the file, and scanning it were successfully completed, false if the file could not be downloaded from cloud storage, or if the file could not be scanned.  Note that successful completion does not mean the file is clean; for the output of the virus scanning operation itself, use the CleanResult and FoundViruses parameters. |  [optional]
**cleanResult** | **Boolean** | True if the scan contained no viruses, false otherwise |  [optional]
**containsExecutable** | **Boolean** | True if the scan contained an executable (application code), which can be a significant risk factor |  [optional]
**containsInvalidFile** | **Boolean** | True if the scan contained an invalid file (such as a PDF that is not a valid PDF, Word Document that is not a valid Word Document, etc.), which can be a significant risk factor |  [optional]
**containsScript** | **Boolean** | True if the scan contained a script (such as a PHP script, Python script, etc.) which can be a significant risk factor |  [optional]
**containsPasswordProtectedFile** | **Boolean** | True if the scan contained a password protected or encrypted file, which can be a significant risk factor |  [optional]
**containsRestrictedFileFormat** | **Boolean** | True if the uploaded file is of a type that is not allowed based on the optional restrictFileTypes parameter, false otherwise; if restrictFileTypes is not set, this will always be false |  [optional]
**containsMacros** | **Boolean** | True if the uploaded file contains embedded Macros of other embedded threats within the document, which can be a significant risk factor |  [optional]
**verifiedFileFormat** | **String** | For file format verification-supported file formats, the contents-verified file format of the file.  Null indicates that the file format is not supported for contents verification.  If a Virus or Malware is found, this field will always be set to Null. |  [optional]
**foundViruses** | [**List&lt;CloudStorageVirusFound&gt;**](CloudStorageVirusFound.md) | Array of viruses found, if any |  [optional]
**errorDetailedDescription** | **String** | Detailed error message if the operation was not successful |  [optional]
**fileSize** | **Long** | Size in bytes of the file that was retrieved and scanned |  [optional]
**contentInformation** | [**AdditionalAdvancedScanInformation**](AdditionalAdvancedScanInformation.md) | Contains additional non-threat content verification information |  [optional]



