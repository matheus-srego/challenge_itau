FROM openjdk:11

EXPOSE 8080

ADD /target/*.jar /server/FieldsValidation.jar

WORKDIR /server

ENTRYPOINT ["java","-jar","FieldsValidation.jar"]
