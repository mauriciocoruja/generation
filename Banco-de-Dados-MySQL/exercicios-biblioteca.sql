-- Criar o database “biblioteca”.

-- 2) Visualizar os databases existentes e definir como padrão o database "biblioteca":
show databases;
use biblioteca;

-- 3) Criar a tabela "categoria", conforme especificado no diagrama:
create table categoria(
	id_categoria Integer primary key,
    categoria varchar(100)
);

-- 4) Visualizar a estrutura da tabela "categoria":
describe categoria;

-- 5) Criar a tabela "livro", conforme especificado no diagrama:
create table livro(
	id_livro INTEGER primary key, 
    id_categoria int,
    titulo varchar(200),
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

-- 6) Visualizar a estrutura da tabela "livro":
describe livro;

-- 7) Criar a tabela "aluno", conforme especificado no diagrama:
create table aluno(
	id_aluno integer primary key,
    nome varchar(100)
);

-- 8) Visualizar a estrutura da tabela "aluno":
describe aluno;

-- 9) Criar a tabela "emprestimo", conforme especificado no diagrama:
create table emprestimo(
	id_emprestimo integer not null,
    id_aluno integer not null,
    id_livro integer not null,
    data_emprestimo date unique,
    data_entrega date,
    primary key (id_emprestimo),
    constraint uk_emprestimo unique key(id_emprestimo, id_aluno, id_livro),
    constraint fk_livro_emprestimo foreign key (id_livro) references livro(id_livro),
    constraint fk_aluno_emprestimo foreign key (id_aluno) references aluno(id_aluno)
);

drop table emprestimo;
-- 10) Visualizar a estrutura da tabela "emprestimo":
describe emprestimo;

show tables;
select * from emprestimo;











