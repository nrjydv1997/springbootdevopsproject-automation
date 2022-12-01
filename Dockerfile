FROM openjdk:8
EXPOSE 8080
ADD target/springbootdevopsproject.jar springbootdevopsproject.jar
ENTRYPOINT [ "java","-jar","springbootdevopsproject.jar" ]
