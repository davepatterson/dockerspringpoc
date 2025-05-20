# simple docker file to run spring boot application in container
FROM amazoncorretto:17.0.15
RUN yum update -y && yum install -y shadow-utils
RUN groupadd spring && useradd -g spring spring
USER spring:spring
ARG DEPENDENCY=target/dependency
COPY ${DEPENDENCY}/BOOT-INF/lib /app/lib
COPY ${DEPENDENCY}/META-INF /app/META-INF
COPY ${DEPENDENCY}/BOOT-INF/classes /app
ENTRYPOINT ["java","-cp","app:app/lib/*","DockerspringpocApplication.Application"]