# Spring Boot Application
A Spring Boot app with Java 18.

## Spring Boot Setup
1. Generate the boilerplate:
   - [Spring Initializr](https://start.spring.io/)
   - Basic Java-Maven project with Java 18 (`Spring Web` dependency is required)
   ![Basic project example](assets/spring-boot-example.png)


2. Start a new project with the generated file and set `Project SDK` (e.g. 18 - if it is the latest Java version, 
you will need to download the JDK-18, and set all the project with it and the SDK with X-Experimental):

   ![Set project SDK](assets/set-project-sdk-001.png)
   ![Set platform settings SDK](assets/set-project-sdk-002.png)

    **NOTE**: You can download the latest version from [Oracle](https://www.oracle.com/java/technologies/downloads/#jdk18-windows)
    and set the environment variable with the new Java path (remember to delete any Java existing path)



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