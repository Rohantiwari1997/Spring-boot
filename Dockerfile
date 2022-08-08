FROM openjdk:8-alpine

EXPOSE 8080

ADD target/docker-demo-springboot.jar docker-demo-springboot.jar

ENTRYPOINT ["java" ,"-jar","docker-demo-springboot.jar"]
