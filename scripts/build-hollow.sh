#!/usr/bin/env bash

mvn clean package -P hollow -D skipTests
cp ./target/hollow.jar ./hollow
