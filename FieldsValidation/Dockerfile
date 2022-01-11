FROM openjdk:11

EXPOSE 8080

ADD /target/*.jar /server/FieldsValidation.jar

WORKDIR /server

ENTRYPOINT ["java","-jar","FieldsValidation.jar"]

# Para depurar é só remover o comentário do ENTRYPOINT abaixo e comentar o ENTRYPOINT de cima..
#ENTRYPOINT ["java","-agentlib:jdwp=transport=dt_socket,server=y,suspend=n,address=*:8081","-jar","FieldsValidation.jar"]
