FROM openjdk:21-ea-17-jdk-slim-buster
EXPOSE 8080
ADD target/astudy01-action.jar astudy01-action.jar
ENTRYPOINT ["java", "-jar", "/astudy01-action.jar"]

#FROM eclipse-temuring: 17-jdk-alpine
#WORKDIR /app
#COPY target/astudy01-action.jar astudy01-action.jar
#CMD ["java", "-jar", "/astudy01-action.jar"]