FROM eclipse-temurin:latest
LABEL authors="codingtest"
ARG JAR_FILE=build/libs/*.jar
COPY ${JAR_FILE} app.jar
EXPOSE 8090
CMD ["java", "-jar", "app.jar"]