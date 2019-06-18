create database biblioteca;

-- 2) Visualizar os databases existentes e definir como padrão o database "biblioteca":
show databases;
use biblioteca;

-- 3) Criar a tabela "categoria", conforme especificado no diagrama:
create table categoria(
	id_categoria Integer primary key not null,
    categoria varchar(100) not null
);

-- 4) Visualizar a estrutura da tabela "categoria":
describe categoria;

-- 5) Criar a tabela "livro", conforme especificado no diagrama:
create table livro(
	id_livro INTEGER primary key not null,
	titulo varchar(200),
    id_categoria integer not null,
    FOREIGN KEY (id_categoria) REFERENCES categoria(id_categoria)
);

-- 6) Visualizar a estrutura da tabela "livro":
describe livro;

-- 7) Criar a tabela "aluno", conforme especificado no diagrama:
create table aluno(
	id_aluno integer primary key not null,
    nome varchar(100) not null
);

-- 8) Visualizar a estrutura da tabela "aluno":
describe aluno;

-- 9) Criar a tabela "emprestimo", conforme especificado no diagrama:
create table emprestimo(
	id_emprestimo integer not null,
    id_aluno integer not null,
    id_livro integer not null,
    data_emprestimo date,
    data_entrega date,
    primary key (id_emprestimo),
    constraint uk_emprestimo unique key(id_emprestimo, id_aluno, id_livro),
    constraint fk_livro_emprestimo foreign key (id_livro) references livro(id_livro),
    constraint fk_aluno_emprestimo foreign key (id_aluno) references aluno(id_aluno)
);

-- 10) Visualizar a estrutura da tabela "emprestimo":
describe emprestimo;

-- drop database biblioteca;

INSERT INTO aluno VALUES (100, 'Zacarias da Mata');
INSERT INTO aluno VALUES (200, 'Yolanda Costa Matheus');
INSERT INTO aluno VALUES (300, 'Xisto Gonçalves');
INSERT INTO aluno VALUES (400, 'William Henry Gates');
INSERT INTO aluno VALUES (500, 'Vilma Oliveira Dias');
INSERT INTO aluno VALUES (600, 'Úrsula Pereira');
INSERT INTO aluno VALUES (700, 'Teodoro Silva dos Santos');
INSERT INTO aluno VALUES (800, 'Salomé Souza Lima');
INSERT INTO aluno VALUES (900, 'Ranulfo Jorge da Silva');

INSERT INTO categoria VALUES (10, 'Romance');
INSERT INTO categoria VALUES (20, 'Ficção');
INSERT INTO categoria VALUES (30, 'Comédia');
INSERT INTO categoria VALUES (40, 'Infanto Juvenil');
INSERT INTO categoria VALUES (50, 'Drama');
INSERT INTO categoria VALUES (60, 'Policial');

INSERT INTO livro VALUES (1000, 'Um romance qualquer', 10);
INSERT INTO livro VALUES (1010, 'Um outro romance qualquer', 10);
INSERT INTO livro VALUES (1020, 'Uma ficção baseada em fatos reais', 20);
INSERT INTO livro VALUES (1030, 'Eram os deuses astronautas?', 20);
INSERT INTO livro VALUES (1040, 'Cachinhos Dourados', 40); 
INSERT INTO livro VALUES (1050, 'Chapeuzinho Vermelho', 40); 
INSERT INTO livro VALUES (1060, 'Os três porquinhos', 40); 
INSERT INTO livro VALUES (1070, 'Se eu chorasse uma vez', 50); 
INSERT INTO livro VALUES (1080, 'Um novo amor', 10); 
INSERT INTO livro VALUES (1090, 'A dúvida', 50); 
INSERT INTO livro VALUES (1100, 'A morte do senhor vereador', 60); 
INSERT INTO livro VALUES (1110, 'O mistério dos 5 mentirosos', 60); 
INSERT INTO livro VALUES (1120, 'O robô', 20); 
INSERT INTO livro VALUES (1130, 'Poeiras em alto mar', 50); 
INSERT INTO livro VALUES (1140, 'A volta dos que não foram', 50); 
INSERT INTO livro VALUES (1150, 'O príncipe e o mendigo', 40);

INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (10, 100, 1000, '2010-08-13'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (20, 100, 1080, '2010-08-14'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (30, 200, 1110, '2010-08-15'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (40, 300, 1150, '2010-08-16'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (50, 500, 1120, '2010-08-17'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (60, 500, 1130, '2010-08-18'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (70, 600, 1010, '2010-08-19'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (80, 700, 1020, '2010-08-20'); 
INSERT INTO emprestimo (id_emprestimo, id_aluno, id_livro, data_emprestimo) VALUES (90, 800, 1040, '2010-08-21');

select * from emprestimo;

-- JOINs
	


-- Mostrando todos os livros que os alunos pegaram emprestados -- categorias de alunos
select
a.id_aluno,
a.nome,
l.id_livro,
l.titulo,
c.categoria,
e.data_emprestimo,
e.data_entrega
from aluno a
join emprestimo e on a.id_aluno = e.id_aluno
join livro l on e.id_livro = l.id_livro
join categoria c on c.id_categoria = l.id_categoria;




