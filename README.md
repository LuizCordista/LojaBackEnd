# Loja

Este é um projeto Java desenvolvido com Spring Boot e Maven. O projeto é uma aplicação de loja que utiliza um banco de dados PostgreSQL.

## Requisitos

- Java 17
- Maven
- PostgreSQL

## Configuração

As configurações do banco de dados estão localizadas no arquivo `src/main/resources/application.properties`. Atualmente, as configurações são:

```
spring.datasource.url=jdbc:postgresql://localhost:5432/postgres
spring.datasource.username=postgres
spring.datasource.password=123
```

Você pode alterar essas configurações para corresponder ao seu ambiente de banco de dados.

## Execução

Para executar o projeto, você pode usar o Maven. No diretório raiz do projeto, execute o seguinte comando:

```
mvn spring-boot:run
```

Isso iniciará a aplicação. Você pode acessá-la em `http://localhost:8080`.

## Contribuição

Contribuições são bem-vindas. Por favor, faça um fork do projeto e crie um Pull Request.

## Licença

Este projeto é licenciado sob os termos da licença MIT.
