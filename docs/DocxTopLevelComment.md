
# DocxTopLevelComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path to the comment in the document |  [optional]
**author** | **String** | Author name of the comment |  [optional]
**authorInitials** | **String** | Initials of the author of the comment |  [optional]
**commentText** | **String** | Text content of the comment |  [optional]
**commentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date timestamp of the comment |  [optional]
**replyChildComments** | [**List&lt;DocxComment&gt;**](DocxComment.md) | Child comments, that are replies to this one |  [optional]
**done** | **Boolean** | True if this comment is marked as Done in Word, otherwise it is false |  [optional]



