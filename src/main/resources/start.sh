#!/bin/bash
JAVA_HOME=/tools/jdk1.7.0_40

$JAVA_HOME/bin/java -Dlog4j.configurationFile=/share/LogPOC/log4j2.xml -cp poc.jar:libs/* com.poc.logger.Application &
