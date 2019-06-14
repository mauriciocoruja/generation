/*Criando banco de dados*/
create database generation;

/*Indicando qual banco de dados iremos trabalhar*/
use generation;

/*Criando uma tabela*/
create table alunos (
	id int(11) primary key auto_increment not null,
    nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf varchar(11) 
    );

-- Inserindo dados na tabela
INSERT INTO alunos (
	nome, 
	sobrenome, 
	email, 
	data_nascimento, 
	cpf
) VALUES (
	"Mauricio",
	"Coruja",
	"mau@digitalhouse.com",
	"1990-02-12",
	"12738291029"
);

create table professores (
	id int (11) primary key auto_increment not null,
	nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf int(11) unique,
    formacao varchar(50)
);
create table cursos (
	id int (11) primary key auto_increment not null,
	nome varchar(50),
    instituicao varchar(50)
);
create table turmas (
	id int (11) primary key auto_increment not null,
	nome varchar(50),
    instituicao varchar(50),
    descricao text,
    periodo varchar(20),
    id_alunos int(11),
    id_professores int(11),
    id_cursos int(11)
);

/*Exibindo todas as tabelas */
show tables;

-- Descrever os detalhes de uma tabela 
describe turmas;

-- Selecionando dados individualmente
SELECT 	id,
		nome,
        sobrenome,
        email,
        data_nascimento,
        cpf
FROM alunos;

-- Selecionando todos 
SELECT * FROM alunos;

DROP database generation;

-- Deletando dados
DELETE FROM alunos;

-- Selecionar/filtrar um dado especifico
SELECT * FROM alunos WHERE nome = "Mauricio";

-- Selecionar/filtrar dados especificos usando condicionais
-- AND
SELECT * FROM alunos WHERE nome = "Jorge" AND email = "jorge@digitalhouse.com";

-- OR 
SELECT * FROM alunos WHERE nome = "Jorge" OR email = "mau@digitalhouse.com";
-- -----------------------------------------------------

-- Comando para derrubar a tabela --> DROP TABLE alunos;

-- -----------------------------------------------------

-- Comandos para deletar dados da tabela
DELETE FROM alunos;

DELETE FROM alunos WHERE id = "1";
-- -----------------------------------------------------
ALTER TABLE turmas
ADD FOREIGN KEY (id_alunos) REFERENCES alunos(id);





