FROM amazoncorretto:11-alpine-jdk
MAINTAINER vrivaans
COPY target/backend-0.0.1-SNAPSHOT.jar app.jar
ENTRYPOINT ["java", "jar", "/vrivaans-portfolio.jar"]