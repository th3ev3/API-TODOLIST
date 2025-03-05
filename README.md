
# Documentação da API TodoList

Esta é uma API simples de gerenciamento de tarefas (to-do list), desenvolvida para permitir a criação, leitura, atualização e exclusão de tarefas. A API foi projetada para ser usada com um banco de dados para armazenar as tarefas e fornecer uma interface fácil de usar para interagir com a aplicação.

## Instalação

Clonar o Repositório

```bash
 git clone https://github.com/th3ev3/API--TODOLIST.git

```



Instalar Dependências 

Depois de clonar o repositório, navegue até o diretório do projeto e instale as dependências:


```bash
 cd API--TODOLIST
 npm install

```


Configuração do ambiente

Crie um arquivo .env na raiz do projeto e adicione as seguintes variáveis de ambiente (modifique conforme necessário):

```bash
PORT=3000
DB_URI=mongodb://localhost/todolist
JWT_SECRET=your_jwt_secret

```

Rodando a aplicação

Após configurar o ambiente, você pode rodar a API com o comando:

```bash
npm start

```
## Stack utilizada

**Back-end:** Node.js, Express, MongoDB, Mongoose, JWT.

## Endpoints

#### 1. Criar uma nova tarefa

```http
  POST /tasks
```
#### Corpo da Requisição:

```bash
{
  "title": "Comprar leite",
  "description": "Lembre-se de comprar leite no supermercado",
  "due_date": "2025-03-01"
}

```
#### Resposta: 

```bash
{
  "id": "unique_task_id",
  "title": "Comprar leite",
  "description": "Lembre-se de comprar leite no supermercado",
  "due_date": "2025-03-01",
  "status": "pending"
}
```




#### 2. Obter todas as tarefas

```http
 GET /tasks
```
#### Resposta:

```bash

  {
    "id": "unique_task_id",
    "title": "Comprar leite",
    "description": "Lembre-se de comprar leite no supermercado",
    "due_date": "2025-03-01",
    "status": "pending"
  }

```



#### 3. Atualizar uma tarefa existente

```http
 PUT /tasks/****************:id
```
#### Corpo da requisição:

```bash

{
  "title": "Comprar leite",
  "description": "Comprar leite e pão",
  "status": "completed"
}

```

#### Resposta:

```bash
{
  "id": "unique_task_id",
  "title": "Comprar leite",
  "description": "Comprar leite e pão",
  "status": "completed"
}
```



#### 4. Deletar uma tarefa existente

```http
 DELETE /tasks/****************:id
```
#### Resposta:

```bash

{
  "message": "Tarefa deletada com sucesso"
}

```





