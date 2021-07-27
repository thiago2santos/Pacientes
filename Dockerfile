FROM openjdk:13-jdk-alpine3.10

RUN mkdir -p /app
WORKDIR /app
COPY build/libs/Pacientes-0.1-all.jar /app/

EXPOSE 8089

ENTRYPOINT [ "java","-jar","Pacientes-0.1-all.jar" ]
