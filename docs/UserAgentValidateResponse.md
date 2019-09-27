
# UserAgentValidateResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the operation was successful, false otherwise |  [optional]
**isBot** | **Boolean** | True if the request is a known robot, false otherwise |  [optional]
**botName** | **String** | Optional; name of the robot if the request was from a known robot, otherwise null |  [optional]
**botURL** | **String** | Optional; if available, the URL to the robot |  [optional]
**operatingSystem** | **String** | Operating System of the User-Agent (e.g. Windows) |  [optional]
**operatingSystemCPUPlatform** | **String** | The CPU platform of the User-Agent (e.g. x64) |  [optional]
**operatingSystemVersion** | **String** | The version of the operating system of the User-Agent (e.g. \&quot;10\&quot; for Windows 10) |  [optional]
**deviceType** | **String** | Device type of the User-Agent; possible values are \&quot;DESKTOP\&quot;, \&quot;SMARTPHONE\&quot;, \&quot;TABLET\&quot; |  [optional]
**deviceBrandName** | **String** | Brand name of the User-Agent |  [optional]
**deviceModel** | **String** | Model name or number of the User-Agent |  [optional]
**browserName** | **String** | Name of the Browser |  [optional]
**browserVersion** | **String** | Version of the Browser |  [optional]
**browserEngineName** | **String** | Name of the Browser Engine |  [optional]
**browserEngineVersion** | **String** | Version of the Browser Engine |  [optional]



