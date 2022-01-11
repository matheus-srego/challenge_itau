# Back-end Challenge (iti - Itaú)

**Índice**
 - [Descrição](https://github.com/matheus-srego/challange_itau#descri%C3%A7%C3%A3o)
 - [Problema](https://github.com/matheus-srego/challange_itau#problema)
 - [Técnicas e Tecnologias usadas no projeto](https://github.com/matheus-srego/challange_itau#t%C3%A9cnicas-e-tecnologias-usadas-no-projeto)
 - [Como Executar o projeto](https://github.com/matheus-srego/challange_itau#como-executar-o-projeto)
    - [Ferramentas necessário na sua maquina](https://github.com/matheus-srego/challange_itau#ferramentas-necess%C3%A1rio-na-sua-maquina)
    - [Comandos para executar o projeto](https://github.com/matheus-srego/challange_itau#comandos-para-executar-o-projeto)
 - [Detahes da solução](https://github.com/matheus-srego/challange_itau#detahes-da-solu%C3%A7%C3%A3o)
 - [Assumindo premissas](https://github.com/matheus-srego/challange_itau#assumindo-premissas)

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

Input: Uma senha (string).  
Output: Um boolean indicando se a senha é válida.

Embora nossas aplicações sejam escritas em Kotlin e C# (.net core), você não precisa escrever sua solução usando elas. Use a linguagem de programação que considera ter mais conhecimento.

## Técnicas e Tecnologias usadas no projeto

 - ```Java 11```
 - ```Eclipse IDE```
 - ```Maven```
 - ```Spring Boot```
 - ```JUnit```
 - ```RegEx```
 - ```API Rest```
 - ```Orientação a Objetos```
 - ```Arquitetura Monolítica```

## Como Executar o projeto

### **Ferramentas necessário na sua maquina**

Antes de executar o projeto, é necessário ter as seguintes ferramentas instaladas em sua máquina:
 - [Git](https://git-scm.com/downloads)
 - [Java SDK v-11.0.12](https://www.oracle.com/br/java/technologies/javase/jdk11-archive-downloads.html)
 - [Apache Maven](https://maven.apache.org/download.cgi)
 - [Docker Desktop](https://www.docker.com/products/docker-desktop)
 - [Postman](https://www.postman.com/downloads/)

### **Comandos para executar o projeto**

**Passo 0:** Faça o clone do projeto:
```bash
git clone https://github.com/matheus-srego/challange_itau.git
```

**Passo 1:** Entre na pasta do projeto com o comando abaixo:
```bash
cd ~/challenge_itau/FieldsValidation/
```

**Passo 2:** Execute o comando 'mvn' no terminal:
```bash
mvn clean install
```

**Passo 3:** Execute o docker build a fim de gerar uma imagem:
```bash
docker build -f Dockerfile -t fields_validation .
```
> **_Observação:_** a tag 'fields_validation' pode ser trocado pela tag que desejar, contanto que respeite o padrãolowercase do Docker.

**Passo 4:** Execute o comando abaixo para subir o container:
```bash
docker run -p 8080:8080 -t fields_validation
```

## Detahes da solução
A fim de desenvolver o desafio me vali das tecnologias Java, JUnit, SpringBoot, Maven e RegEx. Da forma como a Descrição e o Problema foram elucidados, tal como nesse ponto do texto:

 > "Construa uma aplicação que exponha uma api web que valide se uma senha é válida."

Decidi criar um projeto usando a arquitetura monolítica em que todas as validações podem ser reutilizadas validando o que foi solicitado e reutilizando as validações criadas pode ser adaptado para outros tipos de campos de maneira coesa e sem quebrar sua arquitetura. A arquitetura do projeto permite a criação de novas classes e métodos de validação apenas realizando as chamadas dos métodos na classe factory que forem necessárias para um dado campo, assim podendo reutilizar metodos da própria validação de senha.

## Assumindo premissas
Assumi a premissa de que o projeto poderia receber, futuramente, outros tipos de campos (como e-mail, CPF, CNPJ, nome..) e que a arquitetura e  código deveriam permitir que as validações do campo 'senha' fossem reutilizadas e personalizadas para cada campo que viesse a ser necessário validar. Desta forma utilizei interface, factory e transformei cada validação solicitada em um método único a fim de que a reutilização de código fosse possível.
