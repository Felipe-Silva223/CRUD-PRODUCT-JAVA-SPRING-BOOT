# CRUD de Produtos em Java com Spring Boot e PostgreSQL
Uma aplicação Java Spring Boot que implementa um CRUD (Create, Read, Update, Delete) para gerenciar produtos utilizando PostgreSQL como banco de dados.

## 🚀 Funcionalidades

- Permite criar novos produtos com nome, descrição e preço.
- Lista todos os produtos cadastrados.
- Permite visualizar detalhes de um produto específico por ID.
- Permite atualizar informações de um produto existente.
- Permite excluir um produto do sistema.

## 💻 Como Utilizar

1. Clone este repositório para o seu ambiente local.
2. Abra o projeto em sua IDE preferida que suporte Java.
3. Certifique-se de ter o PostgreSQL instalado e configurado
4. Configure as propriedades do banco de dados no arquivo application.properties em src/main/resources:
5. Substitua seu-usuario e sua-senha pelas suas credenciais do PostgreSQL ou Outro banco de dados.
6. Execute a aplicação Spring Boot.
7. Utilize o Postman ou similar para interagir com os endpoints RESTful:
- GET /api/products: Retorna todos os produtos.
- GET /api/products/{id}: Retorna um produto pelo ID.
- POST /api/products: Cria um novo produto (envie um JSON no corpo da requisição com name, description e preço).
- PUT /api/products/{id}: Atualiza um produto existente pelo ID (envie um JSON no corpo da requisição com name, description e preço).
- DELETE /api/products/{id}: Deleta um produto pelo ID.

## 📂 Estrutura do Projeto
- controller/: Controladores REST para manipular requisições HTTP.
- dto/: DTOs (Data Transfer Objects) para representar dados de entrada e saída.
- model/: Modelos de dados (entidades) representando os produtos.
- repository/: Repositórios para acessar dados do banco de dados.

## Contribuições

Contribuições são bem-vindas! Abra uma issue ou envie um pull request com melhorias ou correções.

## 👤 Meu LinkedIn 
[Felipe Silva](https://www.linkedin.com/in/felipe-silva-127503198/)

