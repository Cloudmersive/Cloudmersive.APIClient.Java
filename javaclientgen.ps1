Remove-Item –path ./docs –recurse
Remove-Item –path ./gradle –recurse
Remove-Item –path ./scripts –recurse
Remove-Item –path ./src –recurse
& java -jar swagger-codegen-cli.jar generate   -i https://api.cloudmersive.com/validate/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version 1.1.6         -o .
& java -jar swagger-codegen-cli.jar generate    -i https://api.cloudmersive.com/nlp/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version 1.1.6         -o .
& java -jar swagger-codegen-cli.jar generate  -i https://api.cloudmersive.com/ocr/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version 1.1.6         -o .
& java -jar swagger-codegen-cli.jar generate   -i https://api.cloudmersive.com/barcode/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version 1.1.6         -o .
& java -jar swagger-codegen-cli.jar generate  -i https://api.cloudmersive.com/image/docs/v1/swagger  -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version 1.1.6         -o .
& java -jar swagger-codegen-cli.jar generate    -i https://api.cloudmersive.com/convert/docs/v1/swagger -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version 1.1.6         -o .
& java -jar swagger-codegen-cli.jar generate    -i https://api.cloudmersive.com/virus/docs/v1/swagger -l java  --api-package com.cloudmersive.client   --model-package com.cloudmersive.client.model   --invoker-package com.cloudmersive.client.invoker   --group-id com.cloudmersive   --artifact-id cloudmersive-java-api-client   --artifact-version 1.1.6         -o .
#& pushd cloudmersive-java-api-client
& gradle clean
#& mvn install -U
#& gradle build
#& popd