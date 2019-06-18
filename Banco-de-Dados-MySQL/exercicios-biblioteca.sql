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
	id_emprestimo integer primary key,
    id_aluno integer,
    id_livro integer,
    data_emprestimo date unique,
    data_entrega date,
    FOREIGN KEY (id_aluno) REFERENCES aluno(id_aluno),
    FOREIGN KEY (id_livro) REFERENCES livro(id_livro)    
);
-- 10) Visualizar a estrutura da tabela "emprestimo":
describe emprestimo;

show tables;
select * from emprestimo;











