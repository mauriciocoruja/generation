-- 1. Visualizar os databases existentes:
    show databases;
    drop database sys;

-- 2. Criar um database chamado 'sistema'
	CREATE DATABASE sistema;

-- 3. Visualizar novamente os databases existentes e definir como padrão o database 'sistema'
	show databases;
    use sistema;
    
-- 6. Criar a tabela "departamento", conforme especificado no diagrama:
	create table departamento(
		id_departamento int primary key auto_increment not null,
        nome varchar(50),
        telefone char(15)
	);    
    
-- 7. Visualizar a estrutura da tabela "departamento": 
	describe departamento;
    
-- 8. Criar a tabela "funcionario", conforme especificado no diagrama (observe a chaveestrangeira - Foreign Key):
	create table funcionario(
		id_funcionario int primary key auto_increment not null,
        nome varchar(100),
        id_departamento int not null,
        foreign key (id_departamento) references departamento(id_departamento),
        data_cadastro date
    );
    
-- 9. Deletar a tabela funcionário.
	drop table funcionario;
    show tables;

-- 10. Criar a tabela "funcionario", conforme especificado no diagrama (sem a chave estrangeira - Foreign Key):
	create table funcionario(
		id_funcionario int primary key auto_increment not null,
        nome varchar(100),
        data_cadastro date
);
