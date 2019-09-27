
# DetectedLicensePlate

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**licensePlateTextBestMatch** | **String** | Text from the license plate, highest-confidence result |  [optional]
**licensePlateTextRunnerUp** | **String** | Alternate text from the license plate, based on second-highest-confidence result |  [optional]
**locationX** | **Integer** | X location of the left edge of the license plate, starting from the left edge of the photo (X &#x3D; 0) |  [optional]
**locationY** | **Integer** | Y location of the top edge of the license plate, starting from the top edge of the photo (Y &#x3D; 0) |  [optional]
**width** | **Integer** | Width of the license plate&#39;s location in pixels |  [optional]
**height** | **Integer** | Height of the license plate&#39;s location in pixels |  [optional]
**licensePlateRecognitionConfidenceLevel** | **Double** | Confidence score on a range of 0.0 - 1.0 of the accuracy of the detected license plate, with higher scores being better; values about 0.75 are high confidence |  [optional]



