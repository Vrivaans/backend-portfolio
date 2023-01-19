FROM amazoncorretto:11-alpine-jdk
MAINTAINER Vrivaans
COPY target/backend-0.0.1-SNAPSHOT.jar vrivaans-portfolio.jar
ENTRYPOINT ["java", "jar", "/vrivaans-portfolio.jar"]