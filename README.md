# fruitstore-unittests-demo

### This is a demo project for implementing unit tests with 2 different approaches:
- Classical approach - Isolation of the tests instead of isolation of code under test.
- Mockist approach - Isolation of the code under test (class/function). Any dependencies are mocked.

### Project Details
- Java
- Maven
- JUnit
- Mockito for mocking dependencies
- Jacoco for code coverage

### Project structure
- The source classes are in src/main/java
- The unit test classes are in src/test/java

### How to run the tests?
- Pre-requisite: You need to have [maven](https://maven.apache.org/install.html) & [JDK 11](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) installed on your system.
- Clone this repository and run `mvn clean test` from the command line.
- To see coverage report, open the index.html file in `target/site/jacoco/index.html`
