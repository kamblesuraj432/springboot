FROM openjdk:17
EXPOSE 8080
ADD target/emp-app.jar emp-app.jar
ENTRYPOINT [ "java","-jar","/emp-app.jar" ]