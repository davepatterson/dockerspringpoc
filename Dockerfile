FROM amazoncorretto:17.0.15
ARG JAR_FILE=./target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]