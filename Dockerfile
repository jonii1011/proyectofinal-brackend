FROM amazoncorretto:19-alpine-jdk
MAINTAINER Joni
COPY target/joni-0.0.1-SNAPSHOT.jar  joni-app.jar
ENTRYPOINT ["java", "-jar", "/joni-app.jar"]
