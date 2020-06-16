# MyFirstSpringBootApp
This is a basic hotel reservation by date website.

## Getting Started
Clone this repo to your local machine [How To Guide](https://www.howtogeek.com/451360/how-to-clone-a-github-repository/)

### Prerequisites

- Basic Knowledge of JAVA. Great tutorial on [Javatpoint](https://www.javatpoint.com/java-tutorial).
- Java JDK 8 at least  installed locally Oracle Docs for [Mac](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-macos.htm#JSJIG-GUID-2FE451B0-9572-4E38-A1A5-568B77B146DE) & [Windows](https://docs.oracle.com/javase/10/install/installation-jdk-and-jre-microsoft-windows-platforms.htm#JSJIG-GUID-A7E27B90-A28D-4237-9383-A58B416071CA).
- [Maven installed](https://maven.apache.org/guides/index.html)
- An IDE. Check out [intelliJ IDEA](https://www.jetbrains.com/idea/promo/ultimate/?gclid=Cj0KCQjwy6T1BRDXARIsAIqCTXo9VjPwC01ZEn1DUj7FZBFT7JoyWZwxJj8L8HojEme3WZtOjYsj-JgaAudVEALw_wcB).
- Basic knowledge of Springboot

### Installing
Install all project dependencies with:

``$ mvn install``

###How to run
Firstly run the remote progress database container with docker in <b>/bin</b>
- Docker installed
- Psql installed for the postgres database
- Open the start_postgres.sh and run the bash file.

then.

####Maven 
Open a terminal and run the following commands to ensure that you have valid versions of Java and Maven installed:

``$ java -version``

``$ mvn -v``

You should get the versions of Java and Maven.

#####Using the Maven Plugin
The Spring Boot Maven plugin includes a run goal that can be used to quickly compile and run your application. Applications run in an exploded form, as they do in your IDE. The following example shows a typical Maven command to run a Spring Boot application:

``$ mvn spring-boot:run``

#####Using Executable Jar
To create an executable jar run:

``$ mvn clean package``


## Running the tests
Tests can be run by executing following command from the root of the project:

``$ mvn test``

The test should pass.

## Built With
* [Java](https://www.java.com/en/download/)
* [Apache Maven](https://maven.apache.org/guides/index.html)
* [Spring Web](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-developing-web-applications)
* [Thymeleaf](https://docs.spring.io/spring-boot/docs/2.3.0.RELEASE/reference/htmlsingle/#boot-features-spring-mvc-template-engines)

