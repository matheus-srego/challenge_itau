FROM maven:3.8.4-openjdk-11 AS build

WORKDIR /app
COPY pom.xml .

RUN mvn dependency:go-offline -B

COPY src ./src

RUN mvn clean package

FROM openjdk:11-oracle

EXPOSE 8080
EXPOSE 5005

WORKDIR /app

COPY --from=build /app/target/*.jar /app/FieldsValidation.jar

ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:5005","-jar","/app/FieldsValidation.jar"]
