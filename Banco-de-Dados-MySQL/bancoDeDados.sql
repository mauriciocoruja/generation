/*Criando banco de dados*/
create database generation;

/*Indicando qual banco de dados iremos trabalhar*/
use generation;

/*Criando uma tabala*/
create table alunos (
	id int(11) primary key auto_increment not null,
    nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf int(11)
    );

create table professores (
	id int (11) primary key auto_increment not null,
	nome varchar(50),
    sobrenome varchar(50),
    email varchar(50),
    data_nascimento date,
    cpf int(11),
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
    descricao varchar(50),
    periodo varchar(20),
    id_alunos int(11),
    id_professores int(11),
    id_cursos int(11)
);

/*Exibindo todas as tabelas */

show tables;


describe alunos;
