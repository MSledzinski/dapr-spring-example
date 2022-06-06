FROM openjdk:17-jdk-alpine

LABEL taregt=dev_only

ARG APP_PORT=9011

COPY target/dapr1-0.0.1-SNAPSHOT.jar app.jar

EXPOSE ${APP_PORT}
ENTRYPOINT ["java","-jar","/app.jar"]