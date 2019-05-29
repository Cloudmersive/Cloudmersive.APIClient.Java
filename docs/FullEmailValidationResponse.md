
# FullEmailValidationResponse

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**validAddress** | **Boolean** | True if the email address is valid overall, false otherwise |  [optional]
**mailServerUsedForValidation** | **String** | Email server connected to for verification |  [optional]
**validSyntax** | **Boolean** | True if the syntax of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one. |  [optional]
**validDomain** | **Boolean** | True if the domain name of the email address is valid, false otherwise.  This is one component of ValidAddress, but not the only one. |  [optional]
**validSMTP** | **Boolean** | True if the email address was verified by the remote server, false otherwise.  This is one component of ValidAddress, but not the only one. |  [optional]
**isCatchallDomain** | **Boolean** | True if the domain is a catch-all domain name, false otherwise.  Catch-all domain names, while rare, always accept inbound email to ensure they do not lose any potentially useful emails.  Catch-all domain names can occassionally be configured to first accept and store all inbound email, but then later send a bounce email back to the sender after a delayed period of time. |  [optional]
**domain** | **String** | Domain name of the email address |  [optional]



