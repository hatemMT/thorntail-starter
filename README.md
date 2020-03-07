# Thorntail Starter Template
## Requirements
1. JDK 1.8+
2. Maven 3.5+
3. Git
4. Docker

## Maven commands
##### Run unit tests from maven :
 - Unit tests are the tests that don't need any databases or rest services to be running
 - The test class should be named like this pattern `**/*Test.java`
 
Command : `mvn test` 
##### Run integration tests from maven :
 - Integration tests are the tests that need the databases or/and rest services to be running
 - The test class should be named like this pattern `**/*IT.java`
 - Make sure that the database is running before running the integration tests

Command : `mvn verify` 

## Scripts
##### Run the database 
- First make sure that docker is installed and running 
- Then run the command `./scripts/start-database.sh`
##### Build the runtime
`./scripts/build-hollow.sh`
##### Build & Run the application in the built runtime
`./scripts/jar-start.sh`
##### Build & Run the application by maven plugin
`./scripts/mvn-start.sh`

