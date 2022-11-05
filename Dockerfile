FROM openjdk:8
ADD target/microservice-one.jar microservice-one.jar
EXPOSE 9090
ENTRYPOINT ["java" , "-jar" , "microservice-one.jar"]