FROM openjdk:17
COPY . .
ADD target/emp-app.jar emp-app.jar
EXPOSE 8080
ENTRYPOINT [ "java","-jar","/emp-app.jar" ]
