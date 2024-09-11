# Back-end Challenge (iti // Itaú)

<img src="https://comoinvestirdinheiro.com/wp-content/uploads/2021/12/iti-itau.jpg"> 

<div align="center">

![Java Version](https://img.shields.io/badge/Java-v11-important)
![Spring Boot](https://img.shields.io/badge/spring_boot-%236DB33F)
![Maven](https://img.shields.io/badge/maven-%23C71A36)
 
</div>

<div align="center">

![Docker](https://img.shields.io/badge/docker-%232496ED)
![Docker Compose](https://img.shields.io/badge/docker--compose-%230055A4)

</div>

<div align="center">

[![CI for Fields Validation API to do build with Maven, Dockerfile Java and Docker Compose](https://github.com/matheus-srego/challenge_itau/actions/workflows/ci.yaml/badge.svg)](https://github.com/matheus-srego/challenge_itau/actions/workflows/ci.yaml)

</div>

<div align="center">

**Challenge repository:** [itidigital/backend-challenge](https://github.com/itidigital/backend-challenge)

</div>

<div align="center">

[➜ Leia-me em Português](tools/readme/README.pt-BR.md)

</div>

## Table of Contents
 - [Stack](#stack)
 - [Description](#description)
 - [Problem](#problem)
 - [Solution Details](#solution-details)
 - [Assuming Premises](#assuming-premises)
 - [How to Run the Project](#how-to-run-the-project)
    - [Using Dockerfile](#using-dockerfile)
    - [Using Docker Compose](#using-docker-compose)
 - [License](#license)

## Stack

 - ```Java 11```
 - ```Spring Boot 2.6.2```
 - ```Maven 3.8.4```
 - ```JUnit```
 - ```RegEx```
 - ```Docker```
 - ```Postman```


<details>
    <summary><h2 id="project-tree">Project Tree</h2></summary>

```bash
.
├── FieldsValidation
│   ├── Dockerfile
│   ├── mvnw
│   ├── mvnw.cmd
│   ├── pom.xml
│   ├── src
│   │   ├── main
│   │   │   ├── java
│   │   │   │   └── com
│   │   │   │       └── challenge
│   │   │   │           └── itidigital
│   │   │   │               └── fieldsvalidation
│   │   │   │                   ├── FieldsValidationApplication.java
│   │   │   │                   ├── controllers
│   │   │   │                   │   └── ValidatorController.java
│   │   │   │                   ├── services
│   │   │   │                   │   ├── ValidatorFactory.java
│   │   │   │                   │   ├── ValidatorFieldService.java
│   │   │   │                   │   ├── ValidatorService.java
│   │   │   │                   │   └── servicesimpl
│   │   │   │                   │       ├── ValidatorBlankSpaceServiceImpl.java
│   │   │   │                   │       ├── ValidatorDigitServiceImpl.java
│   │   │   │                   │       ├── ValidatorFieldEmptyServiceImpl.java
│   │   │   │                   │       ├── ValidatorLowercaseLetterServiceImpl.java
│   │   │   │                   │       ├── ValidatorNumberOfCharactersServiceImpl.java
│   │   │   │                   │       ├── ValidatorRepeatedCharactersWithinTheSetServiceImpl.java
│   │   │   │                   │       ├── ValidatorRepeatedDigitInSequenceServiceImpl.java
│   │   │   │                   │       ├── ValidatorRepeatedLowercaseLetterInSequenceServiceImpl.java
│   │   │   │                   │       ├── ValidatorRepeatedSpecialCharacterInSequenceServiceImpl.java
│   │   │   │                   │       ├── ValidatorRepeatedUppercaseLetterInSequenceServiceImpl.java
│   │   │   │                   │       ├── ValidatorSpecialCharacterServiceImpl.java
│   │   │   │                   │       └── ValidatorUppercaseLetterServiceImpl.java
│   │   │   │                   └── utils
│   │   │   │                       └── CONSTANTS.java
│   │   │   └── resources
│   │   │       └── application.properties
│   │   └── test
│   │       └── java
│   │           └── com
│   │               └── challenge
│   │                   └── itidigital
│   │                       └── fieldsvalidation
│   │                           ├── FieldsValidationApplicationTests.java
│   │                           └── servicesimpl
│   │                               └── ValidatorServiceTests.java
│   └── target
├── LICENSE
├── README.md
├── docker-compose.yml
└── tools
    ├── postman
    │   └── challenge_itau.postman_collection.json
    ├── readme
    │   └── README.pt-BR.md
    └── scripts
        └── clean.sh
```
</details>

## Description

Consider a password valid if it meets the following criteria:

- Nine or more characters
- At least 1 digit
- At least 1 lowercase letter
- At least 1 uppercase letter
- At least 1 special character
  - Consider the following characters as special: !@#$%^&*()-+
- No repeated characters within the set

Example:

```java
isValid("") // false  
isValid("aa") // false  
isValid("ab") // false  
isValid("AAAbbbCc") // false  
isValid("AbTp9!foo") // false  
isValid("AbTp9!foA") // false
isValid("AbTp9 fok") // false
isValid("AbTp9!fok") // true
```

> **_Note:_**  White spaces should not be considered as valid characters.

## Problem

Build an application that exposes a web API to validate if a password is valid.

**Input:** A password (string).  
**Output:** A boolean indicating whether the password is valid.

Although our applications are written in Kotlin and C# (.net core), you don't need to use these languages. Use the programming language you are most comfortable with.

## Solution Details
To solve the challenge, I used technologies like Java, JUnit, SpringBoot, Maven, and RegEx. Based on how the **Description** and **Problem** were outlined, particularly the part:

 > "Build an application that exposes a web API to validate if a password is valid."

I decided to create a project using a monolithic architecture where all validations can be reused, validating the requested fields and being adaptable for other types of fields in a cohesive manner without breaking the architecture. The project structure allows the creation of new classes and validation methods by simply calling the necessary methods from the factory class, enabling the reuse of the password validation logic.

## Assuming Premises
I assumed that the project could, in the future, receive other types of fields (such as email, CPF, CNPJ, name...) and that the architecture and code should allow password field validations to be reused and customized for each field that might need validation. Thus, I used interfaces, a factory pattern, and transformed each requested validation into a single method so that code reuse is possible.

## How to Run the Project

**Step 0:** Clone the repository
```bash
git clone https://github.com/matheus-srego/challange_itau.git
```

**Step 1:** Navigate to the project folder with the command below
```bash
cd ~/challenge_itau/FieldsValidation/
```
### Using Dockerfile
 - Build the application image
    ```bash
    docker build -f Dockerfile -t openjdk_11 .
    ```

- Run the application container
    ```bash
    docker run -d --name fields_validation_api -p 8080:8080 -t openjdk_11
    ```

### Using Docker Compose
 - Run Docker Compose in debug mode
    ```bash
    DEBUG=true docker-compose up -d --build
    ```

 - Run Docker Compose without debug mode
    ```bash
    DEBUG=false docker-compose up -d --build
    ```
    *or simply run the command without 'DEBUG=false'*


## Running Unit Tests

The tests were written to ensure the integrity of the application, trying to cover password validation and its characters as thoroughly as possible. Below is how to run them:

**Run all tests**
```bash
mvn test
```

**Run specific tests**
```bash
mvn -Dtest=TestName test
```

## License
This repository is licensed under [MIT Licensed](https://github.com/matheus-srego/challenge_itau/blob/main/LICENSE).

---

### Acknowledgment

I used ChatGPT to assist me in improving the translation of this README to English.
