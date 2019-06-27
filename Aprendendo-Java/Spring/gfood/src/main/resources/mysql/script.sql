-- create database gfood;

use gfood;

create table cliente(
	id integer not null auto_increment,
    nome varchar(100) not null,
    endereco varchar(200),
    primary key (id)
);

insert into cliente (nome, endereco)
values ('Fillipi', 'Rua Afonso Pena, 501');

insert into cliente (nome, endereco)
values ('Vittoria', 'Rua Dalmacia, 448');

select * from cliente;