FROM openjdk:11

EXPOSE 8080

ADD /target/*.jar /server/FieldsValidation.jar

WORKDIR /server

ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8081","-jar","FieldsValidation.jar"]
