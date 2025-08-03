
# NsfwAdvancedResult

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**successful** | **Boolean** | True if the classification was successfully run, false otherwise |  [optional]
**cleanResult** | **Boolean** | True if the result was clean, false otherwise |  [optional]
**containsNudity** | **Boolean** | True if the image contains nudity or sex, false otherwise |  [optional]
**containsGraphicViolence** | **Boolean** | True if the image contains graphic violence and/or gore, false otherwise |  [optional]
**containsNonGraphicViolence** | **Boolean** | True if the image contains non-graphic violence, e.g. weapons, false otherwise |  [optional]
**containsSelfHarm** | **Boolean** | True if the image contains self-harm or suicide imagery, false otherwise |  [optional]
**containsHate** | **Boolean** | True if the image contains hate, false otherwise |  [optional]
**containsPotentialIllegalActivity** | **Boolean** | True if the image contains potentially illegal activity such as drugs, false otherwise |  [optional]
**containsMedicalImagery** | **Boolean** | True if the image contains medical imagery, false otherwise |  [optional]
**containsProfanity** | **Boolean** | True if the image contains profanity or obscenities, false otherwise |  [optional]
**score** | **Double** | Score between 0.0 and 1.0.  Scores of 0.0-0.2 represent high probability safe content, while scores 0.8-1.0 represent high probability unsafe content.  Content between 0.2 and 0.8 is of increasing raciness. |  [optional]
**classificationOutcome** | **String** | Classification result into four categories: SafeContent_HighProbability, UnsafeContent_HighProbability, RacyContent, SafeContent_ModerateProbability |  [optional]



