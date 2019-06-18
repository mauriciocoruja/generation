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

-- 11. Alterar a tabela criada anteriormente para adicionar a chave estrangeira (para quando se esquece da chave estrangeira).
alter table funcionario
add id_departamento int not null,
add constraint fk_funcionario_departamento
foreign key (id_departamento)
references departamento (id_departamento);

-- add foreign key (id_funcionario) references departamento(id_departamento);

-- 12


-- 13. Inserindo registro na tabela &quot;departamento&quot; (com especificação dos campos):
insert into departamento (id_departamento, nome)
values (300, "Departamento de vendas");

-- 14. Inserir mais 5 registros na tabela “departamento”
insert into departamento (id_departamento, nome, telefone)
values  (400, "DP Finceiro", null),
		(500, "DP Marketing", null),
		(600, "DP RH", null),
		(700, "DP Vendas", null),
		(800, "DP Administrativo", null);        

-- 15. Visualizar todos os dados da tabela "departamento":
select * from departamento;

-- 16. Visualizar todos os campos e todos os atributos da tabela "departamento" em ordem alfabética de nome:
select * from departamento order by nome;

-- 17. Visualizar os dados da tabela &quot;departamento&quot; em ordem decrescente de nome:
select * from departamento order by nome desc;

-- 18. Visualizar os dados dos departamentos para os quais não foram atribuídos telefones:
select * from departamento where telefone is null;

-- 19. Visualizar os dados dos departamentos que tenham telefones
select * from departamento where telefone is not null;

-- 20. Visualizar os dados dos departamentos cujo código seja igual a 300. Perceba que "id_departamento" é a chave primária.
select * from departamento where id_departamento = 300;

-- 21. Visualizar os dados dos departamentos cujo nome começa com a letra "D":
select * from departamento where nome like "D%";

-- 22. Visualizar os dados dos departamentos cujo nome termina com a palavra "Vendas":
select * from departamento where nome like "%Vendas";

-- 23. Visualizar os dados dos departamentos cujo nome contenha a palavra "de":
select * from departamento where nome like "%de%";

-- 24. Visualizar os dados dos departamentos cujo nome NÃO contenha a palavra "de":
select * from departamento where nome not like "%de%";

-- 25. Visualizar o telefone do departamento cujo código identificador seja igual a 300:
select * from departamento where id_departamento like 300;

-- (usando atualizar) 25. Visualizar o telefone do departamento cujo código identificador seja igual a 300:
update departamento
set telefone = "(11) 99889-8876"
where id_departamento = 300;

select * from departamento where id_departamento = 300;

-- 26. Apagar departamento cujo código seja igual a 400:
delete from departamento where id_departamento = 400;
select * from departamento where id_departamento = 400; -- verificando se realmente foi apagado

-- 27. Digite o comando para fechar/desconectar do MySQL.
-- (Para logar no banco: )
-- Comando usado: QUIT ou \q

-- Pesquisar como logar e deslogar no banco mysql pelo terminal

-- 28. Digite o comando para verificar a versão e data atual.
select version();
select sysdate();
select now();
select current_date();

-- 29. Digite o comando para verificar o usuário.
select user();

-- 30. Digite o comando para cancelar outro comando que está no meio do processo de entrada no prompt.
-- comando usado: \c



























