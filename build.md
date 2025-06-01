# Building the Cloudmersive Java API Client

This project can be built using either Maven or Gradle. Each build system will create a JAR file containing the compiled client library.

## Using Maven

1. Ensure Maven is installed and available on your `PATH`.
2. Run the package phase:

```bash
mvn package
```

After the build completes, the JAR will be located in the `target/` directory. The file name includes the current version, for example:

```
target/cloudmersive-java-api-client-1.2.2.jar
```

## Using Gradle

1. Ensure the Gradle wrapper (`gradlew`) is executable:

```bash
chmod +x gradlew
```

2. Invoke the build task:

```bash
./gradlew build
```

When the build finishes, the JAR will be generated in `build/libs/` with a file name similar to:

```
build/libs/cloudmersive-java-api-client-1.2.2.jar
```

The version in the file name corresponds to the version defined in the build configuration.
