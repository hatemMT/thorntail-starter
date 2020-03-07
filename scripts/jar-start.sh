#!/usr/bin/env bash
mvn clean package
java -agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=5005 \
-jar hollow/hollow.jar target/thorntail-starter.war -s target/classes/project-defaults.yml
