#start with base image containing java runtime
FROM openjdk:17-jdk-slim

#info of who maintains the image
MAINTAINER fahim00644@gmail.com

#Copy app jar to image
COPY target/accounts-0.0.1-SNAPSHOT.jar accounts-0.0.1-SNAPSHOT.jar

#Command to execute docker application
ENTRYPOINT["java","-jar","accounts-0.0.1-SNAPSHOT.jar"]