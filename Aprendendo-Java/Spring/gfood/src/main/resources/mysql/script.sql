create database gfood;

use gfood;

create table produto(
	id integer not null auto_increment,
    nome varchar(100) not null,
    descricao varchar(200),
    primary key (id)
);

insert into produto (nome, descricao)
values ('Coxinha', 'Melhor coxinha de São Paulo'),
       ('Risole', 'Risole mais top que você vai comer em toda a sua vida. Confia na call'),
       ('Kibe', 'Topzera da Bahia');

create table cliente(
    id integer not null auto_increment,
    nome varchar(100) not null,
    cpf varchar(14) not null,
    endereco varchar(200) not null,
    datanascimento date not null,
    primary key (id)
);

insert into cliente(nome, cpf, endereco, datanascimento)
    values ('Pedro', '123.123.123-2','rua aurorinha,32','2000-01-01');

select * from cliente

