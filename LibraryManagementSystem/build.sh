#!/bin/bash
cd library-core
mvn clean install
cd ..
cd library-services
mvn clean install
cd ..