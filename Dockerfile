FROM openjdk:11
VOLUME /tmp
ARG JAR_FILE
COPY target/server-1.0-SNAPSHOT.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]