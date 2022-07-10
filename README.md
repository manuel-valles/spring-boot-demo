# Spring Boot Application
A Spring Boot app with Java 18.

## Spring Boot Setup
### Using Initializr
1. Generate the boilerplate:
   - [Spring Initializr](https://start.spring.io/)
   - Basic Java-Maven project with Java 18 (`Spring Web` dependency is required)
   ![Basic project example](assets/spring-boot-example.png)


2. Start a new project with the generated file and set `Project SDK` (e.g. 18 - if it is the latest Java version, 
you will need to download the JDK-18, and set all the project with it and the SDK with X-Experimental):

   ![Set project SDK](assets/set-project-sdk-001.png)
   ![Set platform settings SDK](assets/set-project-sdk-002.png)

    **NOTE**: You can download the latest JDK version from [Oracle](https://www.oracle.com/java/technologies/downloads/#jdk18-windows)
    and set the environment variable with the new Java path, e.g. `C:\Program Files\Java\jdk-18.0.1.1\bin` (remember to 
    delete any existing Java path). `$ java --version`

3. Set your IntelliJ to _reload on save_:

   - Add _Spring Boot Devtools_:
   ![Add Spring Boot DevTools](assets/spring-boot-devtools.png)
   
   - Reload the Maven dependencies (icon on the top right)
   ![Reload Maven dependencies](assets/reload-maven-dependencies.png)
   
   - Allow auto-reload on server changes:
     - In Advanced Settings > `Allow auto make...`
     ![Allow to auto start](assets/auto-reload-setting001.png)
     - And tick also the Compiler `Build project automatically`
     ![Set project to build automatically](assets/auto-reload-setting002.png)

### From Scratch
[Spring Boot reference](https://docs.spring.io/spring-boot/docs/current/reference/html/) \
[Getting Started](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started)

1. Install any missing local dependency like [Maven](https://maven.apache.org/download.cgi). You can download the 
`Binary zip archive` and unzip it in your `Program Files`, and finally add a new environment variable under `Path`, 
e.g. `C:\Program Files\apache-maven-3.8.6\bin`. `$ mvn -v`

2. At this point, you should have only the `.gitignore` in your project folder. 
   - Copy the basic `pom.xml` from the [reference](https://docs.spring.io/spring-boot/docs/current/reference/html/getting-started.html#getting-started.first-application.pom)
   - Run: 
     - `$ mvn package` to detects the Maven and gives you a working build 
     - `$ mvn dependency:tree` to check the pom file and install any dependency, what it is only `com.example:myproject:jar:0.0.1-SNAPSHOT`
   - Add the recommended dependencies and re-run the last command to install them
3. Create the main Java file `src/main/java/MyApplication.java` with the SpringBoot syntax and run `$ mvn spring-boot:run`

