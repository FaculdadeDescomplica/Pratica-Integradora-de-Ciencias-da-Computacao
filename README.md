# Prática Integradora da Ciência da Computação
Esse repositório tem como principal objetivo guardar os códigos e exemplos utilizdos nas aulas práticas da disciplina para aprimorar suas habilidades em vários tópicos.


## 📚 Organização desse repositório
As pastas do repositório, nomes de arquivos e commits indicam qual aula e/ou módulo aquele arquivo está relacionado.
É necessário acompanhar junto com as aulas.

## 💻 Conceitos apresentados em sala de aula e materiais

### Kanban
É uma metodologia de gestão visual que usa cartões e colunas para controlar fluxos de trabalho. O termo vem do japonês e significa "sinalização" ou "cartão".

[Trello: Modelo Padrão de um Quadro Kanban](https://trello.com/b/5FldI0TK/kanban-quadro-modelo)

[Trello: Quadro Kanban do Sistema de Consultório Médico](https://trello.com/invite/b/674365bb767f862a1bb9bade/ATTIfbbda997abb54a0bd61ef758498ef79dD272AAA1/kanban-board-sistema-de-consultorio-medico)
* Preferencialmente, esteja logado a sua conta do Trello para acessar e visualizar o quadro


### Requisitos
Em tecnologia, são especificações que definem as funcionalidades, recursos e restrições de um sistema. Eles são a base para o desenvolvimento de um projeto de TI.

[Notion: Modelos para PRD: Documento de requisitos do produto](https://www.notion.com/pt/templates/category/product-requirements-doc)

[Documentação de Requisitos do Produto construído em sala de aula](https://acrispteixeira.notion.site/Documenta-o-de-Requisitos-do-Produto-1480c8ac1bbf80549e00e78626f046db)
* Preferencialmente, esteja logado a sua conta do Notion para acessar e visualizar o documento

Foi apresentado o **Card de requisito** em sala de aula - verificar o link do quadro Kanban acima.

### Diagrama de Entidade-Relacionamento (DER)
Um diagrama de entidade e relacionamento (também conhecido como diagrama ER ou simplesmente DER) mostra como as entidades (pessoas, objetos e conceitos) interagem.

![DER-ConsultorioMedico](https://github.com/user-attachments/assets/85a169ee-a360-4297-8058-cb1f8f7c9f7e)

### Banco de Dados
Acompanhar Aula 3 do Módulo 3

[Link para Download do MySQL Community Server](https://dev.mysql.com/downloads/mysql/)
Passo a passo:
1. Executar Mysql Configurator
2. Adicionar senha
3. Seguir pra executar

[Link para Download do MySQL Workbench](https://dev.mysql.com/downloads/workbench/)
Passo a passo:
1. Instalar e executar Workbench
2. Executar comando para criação do banco (onde test_db será o nome do seu banco de dados)
   ```
   CREATE DATABASE teste_db;
   ```
4. Comando para usar o banco (onde test_db será o nome do banco de dados criado anteriormente)
   ```
   USE teste_db;
   ```
6. Criar primeira tabela
   ```
   CREATE TABLE clientes (
     id INT AUTO_INCREMENT PRIMARY KEY,
     nome VARCHAR(100),
     email VARCHAR(100),
     data_registro DATE );
   ```
7. Buscar a tabela ou mostrar com select

### Acompanhar em aula: aula 6 do Módulo 3

Diagrama de Casos de Uso, ferramenta utilizada: Lucid Charts.

![Diagrama de caso de uso - Sistema de Consultório Médico](https://github.com/user-attachments/assets/2374ea2d-95f2-45a6-b4b8-433a7efd4865)

Diagrama de Classes UML, ferramenta utilizada: Lucid Charts.

![Classe UML](https://github.com/user-attachments/assets/a95e448b-b0d2-40f2-a112-eb04c318d423)


### Acompanhar em aula: aula 5 do Módulo 6
Ferramenta utilizada: Draw.io

![API](https://github.com/user-attachments/assets/22ec054b-ec11-421e-b9a3-3228c006b09f)

### Acompanhar em aula: aula 6 do Módulo 7
Ferramenta utilizada: Draw.io

![Blockchain](https://github.com/user-attachments/assets/af62c9a7-a28a-4702-b9a2-27064348c8c3)

### Acompanhar em aula: aula 3 do Módulo 8
Ferramenta utilizada: Draw.io

![AppMoveis](https://github.com/user-attachments/assets/8f58f01c-7458-429c-98d3-4a90e256c525)


### Acompanhar em aula: aula 6 do Módulo 9
#### Como publicar seu site na Web
1. Escolhendo um Serviço de Hospedagem
2. Registrando um Domínio

Exemplo de site criado com Wordpress: https://desenvolvimentowebonline.wordpress.com/


### 📫 Contribuindo para a disciplina com exemplos
<!---Se você foi aluno dessa disciplina e deseja contribuir com ajustes e/ou funcionalidades entre em contato com o responsável da sua aula e considere a criação de um arquivo CONTRIBUTING.md separado--->
Para contribuir, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <seu_nome_exemplo>`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`
4. Envie para o branch original: `git push origin <seu_nome_exemplo> / <local>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).
