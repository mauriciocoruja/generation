drop database gfood;
create database gfood;


use gfood;

create table produto(
                        id integer not null auto_increment,
                        nome varchar(100) not null,
                        descricao varchar(200),
                        preco float not null ,
                        primary key (id)
);

create table cliente(
                        id integer not null auto_increment,
                        nome varchar(100) not null,
                        cpf varchar(14) not null,
                        endereco varchar(200) not null,
                        datanascimento date not null,
                        primary key (id)
);

select * from produto;
describe produto

-- alter table produto add column preco decimal not null;
-- alter table produto change precinho preco decimal not null;

-- comando para atualizar varios dados iguais
-- update cliente set datanascimento = '0000-00-00' where datanascimento is null;