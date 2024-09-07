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

**Repositório do desafio:** [itidigital/backend-challenge](https://github.com/itidigital/backend-challenge)

</div>

<div align="center">

[➜ Read me in English](https://github.com/matheus-srego/challenge_itau/blob/main/README.md)

</div>

## Índice
 - [Stack](#stack)
 - [Descrição](#descrição)
 - [Problema](#problema)
 - [Detahes da solução](#detalhes-da-solução)
 - [Assumindo premissas](#assumindo-premissas)
 - [Como Executar o projeto](#como-executar-o-projeto)
    - [Com Dockefile](#com-dockerfile)
    - [Com Docker Compose](#com-docker-compose)
 - [Licença](#licença)

## Stack

 - ```Java 11```
 - ```Spring Boot 2.6.2```
 - ```Maven 3.8.4```
 - ```JUnit```
 - ```RegEx```
 - ```Docker```
 - ```Postman```

## Descrição

Considere uma senha sendo válida quando a mesma possuir as seguintes definições:

- Nove ou mais caracteres
- Ao menos 1 dígito
- Ao menos 1 letra minúscula
- Ao menos 1 letra maiúscula
- Ao menos 1 caractere especial
  - Considere como especial os seguintes caracteres: !@#$%^&*()-+
- Não possuir caracteres repetidos dentro do conjunto

Exemplo:  

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

> **_Nota:_**  Espaços em branco não devem ser considerados como caracteres válidos.

## Problema

Construa uma aplicação que exponha uma api web que valide se uma senha é válida.

**Input:** Uma senha (string).  
**Output:** Um boolean indicando se a senha é válida.

Embora nossas aplicações sejam escritas em Kotlin e C# (.net core), você não precisa escrever sua solução usando elas. Use a linguagem de programação que considera ter mais conhecimento.

## Detahes da solução
A fim de desenvolver o desafio me vali das tecnologias Java, JUnit, SpringBoot, Maven e RegEx. Da forma como a Descrição e o Problema foram elucidados, tal como nesse ponto do texto:

 > "Construa uma aplicação que exponha uma api web que valide se uma senha é válida."

Decidi criar um projeto usando a arquitetura monolítica em que todas as validações podem ser reutilizadas validando o que foi solicitado e reutilizando as validações criadas pode ser adaptado para outros tipos de campos de maneira coesa e sem quebrar sua arquitetura. A arquitetura do projeto permite a criação de novas classes e métodos de validação apenas realizando as chamadas dos métodos na classe factory que forem necessárias para um dado campo, assim podendo reutilizar metodos da própria validação de senha.

## Assumindo premissas
Assumi a premissa de que o projeto poderia receber, futuramente, outros tipos de campos (como e-mail, CPF, CNPJ, nome..) e que a arquitetura e  código deveriam permitir que as validações do campo 'senha' fossem reutilizadas e personalizadas para cada campo que viesse a ser necessário validar. Desta forma utilizei interface, factory e transformei cada validação solicitada em um método único a fim de que a reutilização de código fosse possível.

## Como executar o projeto

**Passo 0:** Faça o clone do projeto
```bash
git clone https://github.com/matheus-srego/challange_itau.git
```

**Passo 1:** Entre na pasta do projeto com o comando abaixo
```bash
cd ~/challenge_itau/FieldsValidation/
```
### Com Dockefile
 - Construir a imagem da aplicação
    ```bash
    docker build -f Dockerfile -t openjdk_11 .
    ```

- Executar o container da aplicação
    ```bash
    docker run -d --name fields_validation_api -p 8080:8080 -t openjdk_11
    ```

### Com Docker Compose
 - Executar o Docker Compose no modo debug
    ```bash
    DEBUG=true docker-compose up -d --build
    ```

 - Executar o Dokcer Compose sem o modo debug
    ```bash
    DEBUG=false docker-compose up -d --build
    ```
    *ou simplesmente executar o comando sem 'DEBUG=false'*

## Licença
Este repositório é licenciado sob a [MIT Licensed](https://github.com/matheus-srego/challenge_itau/blob/main/LICENSE).
