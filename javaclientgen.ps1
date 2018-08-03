Remove-Item ./client -Force -Recurse
Remove-Item –path ./docs –recurse
Remove-Item –path ./gradle –recurse
Remove-Item –path ./scripts –recurse
Remove-Item –path ./src –recurse
& java -jar swagger-codegen-cli.jar generate   -i https://api.cloudmersive.com/validate/docs/v1/swagger  -l java -o client -c packageconfig.json
& java -jar swagger-codegen-cli.jar generate    -i https://api.cloudmersive.com/nlp/docs/v1/swagger  -l java -o client -c packageconfig.json
& java -jar swagger-codegen-cli.jar generate  -i https://api.cloudmersive.com/ocr/docs/v1/swagger  -l java -o client -c packageconfig.json
& java -jar swagger-codegen-cli.jar generate   -i https://api.cloudmersive.com/barcode/docs/v1/swagger  -l java -o client -c packageconfig.json
& java -jar swagger-codegen-cli.jar generate  -i https://api.cloudmersive.com/image/docs/v1/swagger  -l java -o client -c packageconfig.json
& java -jar swagger-codegen-cli.jar generate    -i https://api.cloudmersive.com/convert/docs/v1/swagger -l java -o client -c packageconfig.json
& java -jar swagger-codegen-cli.jar generate    -i https://api.cloudmersive.com/virus/docs/v1/swagger -l java -o client -c packageconfig.json
Copy-item -Force -Recurse -Verbose ./client/* -Destination .
Remove-Item ./client -Force -Recurse
#& pushd cloudmersive-java-api-client
& gradle clean
#& mvn install -U
& gradle build
#& popd