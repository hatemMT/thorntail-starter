#!/usr/bin/env bash
mvn clean package thorntail:run -D thorntail.bundleDependencies=false -D thorntail.debug.port=5005 \
-D thorntail.http.port=8080
