-- create database gfood;

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

select * from produto;