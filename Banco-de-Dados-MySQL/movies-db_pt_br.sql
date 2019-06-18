select avg(rating)
from movies;

-- COUNT
select count(*) from movies;
select count(*) from actors;

-- Selecionando os filmes onde os id's correspondem ao numero 3
select count(id) as total from movies where genre_id = 3;

-- Selecionar todos os movies
select * from movies;

-- AVG()
select avg(rating) as media from movies;

-- SUM
select sum(length) as total_minutes from movies where rating >=9;

-- MIN()
select @minimo := min(rating) from movies;
select * from movies where rating = @minimo;

-- max()
select @maximo:= max(rating) from movies;
select * from movies where rating = @maximo;

-- group by
-- select title from movies group by genre_id = 3;
