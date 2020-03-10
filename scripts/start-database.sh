#!/usr/bin/env bash

docker run --name app-db -p 3306:3306  -e MYSQL_DATABASE=app-db -e MYSQL_ROOT_PASSWORD=secret -d mysql
