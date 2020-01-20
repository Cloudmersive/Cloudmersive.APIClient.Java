
# DocxComment

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**path** | **String** | Path to the comment in the document |  [optional]
**author** | **String** | Author name of the comment |  [optional]
**authorInitials** | **String** | Initials of the author of the comment |  [optional]
**commentText** | **String** | Text content of the comment |  [optional]
**commentDate** | [**OffsetDateTime**](OffsetDateTime.md) | Date timestamp of the comment |  [optional]
**isTopLevel** | **Boolean** | True if the comment is at the top level, false if this comment is a child reply of another comment |  [optional]
**isReply** | **Boolean** | True if this comment is a reply to another comment, false otherwise |  [optional]
**parentCommentPath** | **String** | Path to the parent of this comment, if this comment is a reply, otherwise this value will be null |  [optional]
**done** | **Boolean** | True if this comment is marked as Done in Word, otherwise it is false |  [optional]



