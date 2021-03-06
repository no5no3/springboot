FROM openjdk:8-jdk-alpine
VOLUME /tmp
ADD ./build/libs/springboot-0.0.1.jar app.jar
ENTRYPOINT ["java","-jar","/app.jar","--spring.profiles.active=prod"]
#CMD ["-c"] #this will add to ENTRYPOINT, will be overridden when running the container with alternative arguments
EXPOSE 8081