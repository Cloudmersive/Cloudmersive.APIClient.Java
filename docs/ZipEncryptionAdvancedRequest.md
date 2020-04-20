
# ZipEncryptionAdvancedRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**inputFileContents** | **byte[]** | Input Zip File archive contents in bytes |  [optional]
**password** | **String** | Password to place on the Zip file; the longer the password, the more secure |  [optional]
**encryptionAlgorithm** | **String** | Encryption algorithm to use; possible values are AES-256 (recommended), AES-128, and PK-Zip (not recommended; legacy, weak encryption algorithm).  Default is AES-256. |  [optional]



