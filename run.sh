#!/bin/bash -ex

mvn -q clean
mvn -q compile
mvn -q exec:java -Dexec.mainClass="csci2720.dll.App" -Dexec.args="resources/string-input.txt"
