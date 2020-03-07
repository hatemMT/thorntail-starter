#!/usr/bin/env bash

docker run --name app-db -e MYSQL_DATABASE=app-db -e MYSQL_ROOT_PASSWORD=secret -d mysql
