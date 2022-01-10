FROM openjdk:11

EXPOSE 8080

ADD /target/*.jar /server/Fieldsalidation.jar

WORKDIR /server

ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8081","-jar","Fieldsalidation.jar"]