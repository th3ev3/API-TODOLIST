
# Auth Service API


Este é um serviço de autenticação desenvolvido com Spring Boot e Spring Security, utilizando JWT (JSON Web Token) para fornecer autenticação sem estado (stateless). A API permite que usuários se registrem e façam login para obter um token JWT, que é utilizado para autenticação em requisições subsequentes.

## Instalação

Clonar o Repositório

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
cd seu-repositorio

```

Configurar o Banco de Dados


```bash
CREATE DATABASE auth_service;

```
No arquivo application.properties (ou application.yml), configure as credenciais do banco:        

```bash
spring.datasource.url=jdbc:mysql://localhost:3306/auth_service
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true


```

Instalar Dependências


```bash
mvn clean install

```


Executar a API



```bash
mvn spring-boot:run

```
## Stack utilizada

**Back-end:** Spring Boot 3.1.5,
Spring Security
,JWT (JSON Web Token)
,Spring Data JPA
,MySQL
,Lombok e
Spring Boot DevTools


## Documentação da API Auth Service


#### Retorna todos os itens

```http
  POST /api/auth/register
```

### **1. Registrar Novo Usuário**

#### Corpo da Requisição:

{
  "username": "usuario_novo",
  "password": "senha123"
}




| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| username     | `string` | **Obrigatório**. Nome de usuário desejado. |
| password	     | `string` | **Obrigatório**. Senha de usuário desejado. |

#### Resposta de Sucesso

{
  "message": "Usuário registrado com sucesso!"
}


#### Resposta de Erro (por exemplo, se o nome de usuário já existir):

{
  "error": "O nome de usuário já está em uso."
}


### **2. Login e Geração de Token JWT**

```http
  POST /api/auth/login
```

#### Corpo da Requisição:

{
  "username": "usuario",
  "password": "senha123"
}




| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| username     | `string` | **Obrigatório**. Nome de usuário desejado. |
| password	    | `string` | **Obrigatório**. Senha de usuário desejado. |



#### Resposta de Sucesso

{
  "token": "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9..."
}


#### Resposta de Erro (exemplo, credenciais inválidas)

{
  "error": "Credenciais inválidas."
}



### **3. Acessar Endpoint Protegido**

```http
    GET /api/protected-endpoint
```
#### Cabeçalho da Requisição

  Authorization: Bearer <seu_token_jwt>

| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| token     | `string` | **Obrigatório**. Token JWT gerado após o login. |


#### Resposta de Sucesso
{
  "message": "Acesso autorizado."
}


#### Resposta de Erro (se o token for inválido ou expirado)

{
  "error": "Token inválido ou expirado."
}



### **4. Logout**

```http
      POST /api/auth/logout
```
#### Cabeçalho da Requisição

   Authorization: Bearer <seu_token_jwt>


| Parâmetro   | Tipo       | Descrição                                   |
| :---------- | :--------- | :------------------------------------------ |
| token     | `string` | **Obrigatório**. Token JWT gerado após o login. |


#### Resposta de Sucesso
{
  "message": "Usuário deslogado com sucesso."
}


#### Resposta de Erro (se o token não for fornecido ou for inválido)

{
  "error": "Token não fornecido ou inválido."
}

### **5. Recuperar Informações do Usuário**

```http
        GET /api/auth/user

```
#### Cabeçalho da Requisição

  Authorization: Bearer <seu_token_jwt>


#### Resposta de Sucesso
{
  "username": "usuario",
  "createdAt": "2025-03-04T10:00:00Z"
}


#### Resposta de Erro (se o token for inválido ou expirado)
{
  "error": "Token inválido ou expirado."
}
