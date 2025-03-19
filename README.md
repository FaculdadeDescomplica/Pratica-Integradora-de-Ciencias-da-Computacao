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

https://dev.mysql.com/downloads/mysql/
Executar Mysql Configurator, adicionar senha e seguir pra executar
https://dev.mysql.com/downloads/workbench/
Instalar e executar Workbench
Executar comando para criação do banco
CREATE DATABASE teste_db;
Comando para usar o banco
USE teste_db;
Criar primeira tabela
CREATE TABLE clientes ( 
id INT AUTO_INCREMENT PRIMARY KEY, 
nome VARCHAR(100), 
email VARCHAR(100), 
data_registro DATE );
Buscar a tabela ou mostrar com select


Colocar o exemplo da aula 6 do mod 3

Colocar diagrama de casos de uso
https://lucid.app/lucidchart/1b0222c9-d2e3-438b-bf5e-24d554946532/edit?page=0_0#

Colocar diagrama de classes da aula
https://lucid.app/lucidchart/eab36992-1608-4f13-951d-e726ac323dc4/edit?page=HWEp-vi-RSFO&invitationId=inv_a70ad9a9-c256-47da-9cfa-930e12fa0f5f#

Colocar desenho Aula 5 Módulo 6 
https://app.diagrams.net/?src=about#G1w2b2Y83msRdixhgNEPwMkGcA5dWc_Zh3#%7B%22pageId%22%3A%22EXC9W3TfjAbKltRNDZMO%22%7D

Colocar desenho Aula 6 Módulo 7
https://app.diagrams.net/#G1tlSm8ojl4TlIVaAo8IvUQlGmTFWabrkd#%7B%22pageId%22%3A%22C5RBs43oDa-KdzZeNtuy%22%7D

Colocar desenho Aula 3 Módulo 8
https://app.diagrams.net/#G1ILYPdkQhOCUquUw5iTpkNbny-HSEpFhK#%7B%22pageId%22%3A%22C5RBs43oDa-KdzZeNtuy%22%7D

Colocar exemplo da Aula 6 Módulo 9
https://desenvolvimentowebonline.wordpress.com/?_gl=1*32j0mb*_gcl_au*NjUwMDg5NzY0LjE3MzMxODQyMzA.


### 📫 Contribuindo para a disciplina com exemplos
<!---Se você foi aluno dessa disciplina e deseja contribuir com ajustes e/ou funcionalidades entre em contato com o responsável da sua aula e considere a criação de um arquivo CONTRIBUTING.md separado--->
Para contribuir, siga estas etapas:

1. Bifurque este repositório.
2. Crie um branch: `git checkout -b <seu_nome_exemplo>`.
3. Faça suas alterações e confirme-as: `git commit -m '<mensagem_commit>'`
4. Envie para o branch original: `git push origin <seu_nome_exemplo> / <local>`
5. Crie a solicitação de pull.

Como alternativa, consulte a documentação do GitHub em [como criar uma solicitação pull](https://help.github.com/en/github/collaborating-with-issues-and-pull-requests/creating-a-pull-request).
