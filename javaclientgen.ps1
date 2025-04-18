Remove-Item –path ./docs –recurse
Remove-Item –path ./gradle –recurse
Remove-Item –path ./scripts –recurse
Remove-Item –path ./src –recurse
$artifact_version = "6.2.2"

Write-Host "Building version $artifact_version"

& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate   -i https://api.cloudmersive.com/validate/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/nlp-v2/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate  -i https://api.cloudmersive.com/ocr/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate   -i https://api.cloudmersive.com/barcode/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate  -i https://api.cloudmersive.com/image/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/convert/docs/v1/swagger -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/config/docs/v1/swagger -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/video/docs/v1/swagger -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/swagger/api/dataintegration -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/swagger/api/currency -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/swagger/api/security -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .
& "C:\Program Files\Java\jdk1.8.0_211\bin\java.exe" -jar swagger-codegen-cli-2.4.44.jar generate    -i https://api.cloudmersive.com/virus/docs/v1/swagger -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version $artifact_version         -o .


Write-Host "Performing replacements..."

# Fix Android bug
(Get-Content ./src/main/java/com/cloudmersive/client/invoker/ApiClient.java).replace('httpClient = new OkHttpClient();', "httpClient = new OkHttpClient();  httpClient.setProtocols(Arrays.asList(Protocol.HTTP_1_1));") | Set-Content ./src/main/java/com/cloudmersive/client/invoker/ApiClient.java

function WhitespaceAgnosticReplace (
    $FilePath,
    $OldSnippetPath,
    $NewSnippetPath
)
{
    # 1. Read file/snippets as single multiline strings
    $fileContent = Get-Content -Path $FilePath -Raw
    $oldSnippet  = Get-Content -Path $OldSnippetPath -Raw
    $newSnippet  = Get-Content -Path $NewSnippetPath -Raw

    # 2. Escape the old snippet so it’s used literally in the Regex
    $escapedOldSnippet = [Regex]::Escape($oldSnippet)

    # 3. Convert each newline in oldSnippet to a pattern allowing optional whitespace
    $pattern = $escapedOldSnippet -replace '\r?\n', '\s*\r?\n\s*'

    # 4. Wrap the pattern to allow leading/trailing whitespace on the first/last lines
    #    and enable multiline matching with (?m).
    $pattern = '(?m)^\s*' + $pattern + '\s*$'

    # 5. Use a MatchEvaluator so the new snippet is inserted *verbatim* 
    #    (i.e., no escaping of backslashes or dollar signs).
    $updatedContent = [Regex]::Replace(
        $fileContent,
        $pattern,
        { param($m) return $newSnippet }
    )

    # 6. Write the updated file content
    Set-Content -Path $FilePath -Value $updatedContent
}




WhitespaceAgnosticReplace './src/main/java/com/cloudmersive/client/invoker/ApiClient.java' './replacements/buildRequestBodyMultipart.old.java' './replacements/buildRequestBodyMultipart.new.java'

WhitespaceAgnosticReplace './src/main/java/com/cloudmersive/client/ScanApi.java' './replacements/scanFileAdvancedCall.old.java' './replacements/scanFileAdvancedCall.new.java'


Write-Host "Performing replacements... Done."

#& pushd cloudmersive-java-api-client
& gradle clean
#& mvn install -U
& gradle build
#& popd

Write-Host "Build completed"