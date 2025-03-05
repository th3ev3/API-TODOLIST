API TodoList

Esta é uma API simples de gerenciamento de tarefas (to-do list), desenvolvida para permitir a criação, leitura, atualização e exclusão de tarefas. A API foi projetada para ser usada com um banco de dados para armazenar as tarefas e fornecer uma interface fácil de usar para interagir com a aplicação.

Tecnologias A API foi desenvolvida com as seguintes tecnologias:

Node.js Express MongoDB (ou outro banco de dados, caso seja utilizado) Mongoose (para interação com MongoDB) JWT (para autenticação) Instalação

Clonando o repositório Clone este repositório em sua máquina local:
git clone https://github.com/th3ev3/API--TODOLIST.git 2. Instalando as dependências Depois de clonar o repositório, navegue até o diretório do projeto e instale as dependências:

bash Copiar Editar cd API--TODOLIST npm install 3. Configuração do ambiente Crie um arquivo .env na raiz do projeto e adicione as seguintes variáveis de ambiente (modifique conforme necessário):

bash Copiar Editar PORT=3000 DB_URI=mongodb://localhost/todolist JWT_SECRET=your_jwt_secret 4. Rodando a aplicação Após configurar o ambiente, você pode rodar a API com o comando:

bash Copiar Editar npm start A API estará disponível em http://localhost:3000.

Endpoints

POST /tasks Cria uma nova tarefa.
Corpo da Requisição:

json Copiar Editar { "title": "Comprar leite", "description": "Lembre-se de comprar leite no supermercado", "due_date": "2025-03-01" } Resposta:

json Copiar Editar { "id": "unique_task_id", "title": "Comprar leite", "description": "Lembre-se de comprar leite no supermercado", "due_date": "2025-03-01", "status": "pending" } 2. GET /tasks Obtém todas as tarefas.

Resposta:

json Copiar Editar [ { "id": "unique_task_id", "title": "Comprar leite", "description": "Lembre-se de comprar leite no supermercado", "due_date": "2025-03-01", "status": "pending" } ] 3. PUT /tasks/:id Atualiza uma tarefa existente.

Corpo da Requisição:

json Copiar Editar { "title": "Comprar leite", "description": "Comprar leite e pão", "status": "completed" } Resposta:

json Copiar Editar { "id": "unique_task_id", "title": "Comprar leite", "description": "Comprar leite e pão", "status": "completed" } 4. DELETE /tasks/:id Deleta uma tarefa existente.

Resposta:

json Copiar Editar { "message": "Tarefa deletada com sucesso" } Contribuição Sinta-se à vontade para fazer um fork deste repositório e submeter pull requests. Se você encontrar algum bug ou tiver sugestões de melhorias, abra uma issue.

Licença Este projeto está licenciado sob a MIT License - veja o arquivo LICENSE para mais detalhes.

Contato Se você tiver dúvidas ou sugestões, entre em contato pelo e-mail: seu-email@dominio.com.

diff Copiar Editar

Este modelo cobre as principais informações que o README de um repositório deve ter, incluindo:

Descrição do projeto.
Tecnologias usadas.
Passos para instalação e configuração.
Exemplos de uso da API.
Como contribuir.
Licença e contato.
Lembre-se de ajustar conforme os detalhes específicos do seu projeto.
