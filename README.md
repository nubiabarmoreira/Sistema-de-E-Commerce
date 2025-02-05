# SISTEMA DE E-COMMERCE


## Índice
1. [Descrição](#descrição)
2. [Explicação](#explicação-do-funcionamento-do-código)
3. [Execução](#execucao)
4. [Tecnologias](#tecnologias-utilizadas)
4. [GitFlow](#gitflow)
5. [Commits](#commits)


## Descrição

Esse é sistema básico de E-Commerce desenvolvido em Java utilizando o framework Spring Boot que permita o cadastro de produtos, clientes e a realização de compras. 
O objetivo é criar um sistema funcional que simule o funcionamento de uma loja virtual, com validações e manipulação de dados.


## Explicação do funcionamento do código

O sistema fornece uma API RESTful, onde é possível:

- Cadastrar produtos - com nomes únicos, preço maior que zero e quantidade maior ou igual a zero; 
- Acessar todos os produtos existentes ou acessar um produto específico pelo seu nome;
- Cadastrar clientes - com CPF e e-mail únicos;
- Atualizar dados de um cliente através do seu CPF;
- Acessar os dados de um cliente específico de um CPF;
- Realizar compras;
- Atualizar o estoque dos produtos;
- E comunicar se um produto está em falta no estoque - caso um produto esteja em falta, a compra de nenhum produto será realizada.


## Execução
1. Certifique-se de ter o Java 17 e o IntelliJ instalados em sua máquina, e o GitHub se desejar clonar o repositório.
2. Clone o repositório pelo GitHub utilizando o comando git clone git@github.com:nubiabarmoreira/Sistema-de-E-Commerce.git
3. Importe o projeto no IntelliJ.
4. Para executar o projeto basta rodar a classe `Main` ou o atalho Shift + F10. Também pode-se utilizar o comando no terminal `mvn spring-boot:run`
5. Acesse a API no navegador ou via Postman: http://localhost:8080 


## Tecnologias utilizadas

As principais tecnologias e ferramentas utilizadas no desenvolvimento deste projeto são:

- Java 17
- Spring Boot 3.4.2
- H2-database
- JPA repository
- Maven 


## GitFlow

- A branch principal é a branch `main`
- Há uma branch secundária para desenvolvimento, a branch `develop`
- Para cada nova branch criada, há um padrão de `feature/`
- Após todos os códigos estarem na `develop` foi feito o merge para a branch `main`


## Commits

-  Foi utilizado coventional commits para manter um padrão de projeto, seguindo essa documentação:
   https://www.conventionalcommits.org/pt-br/v1.0.0/
