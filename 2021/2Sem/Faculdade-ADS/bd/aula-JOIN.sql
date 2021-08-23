create database aulaBD;
use aulaBD;
create table arquivo1 (
    codigo int not null auto_increment,
    nome varchar(20),
    primary key (codigo)
    );

 create table arquivo2 (
    codigo int not null auto_increment,
    nome varchar(20),
    primary key (codigo)
    );
    
insert into arquivo1 (nome) values ("Fernanda"),("Josefa"),("Luiz"),("Fernando"),("Romulo");
select * from arquivo1;

insert into arquivo2 (nome) values ("Carlos"),("Manoel"),("Luiz"),("Fernando"),("Romulo");
select * from arquivo2;

select * from arquivo1, arquivo2 where arquivo1.nome = arquivo2.nome;
select * from arquivo1 as A inner join arquivo2 as B on A.nome = B.nome;
select * from arquivo1 A inner join arquivo2 B on A.nome = B.nome;

select A.nome as "Nome do cliente", B.nome as Nome from arquivo1 A  
             join arquivo2 B on A.nome = B.nome
             where B.nome like 'R%';
             
select A.nome,B.nome from arquivo1 A left join arquivo2 B on A.nome = B.nome where B.nome is null;
select A.nome,B.nome from arquivo1 A right join arquivo2 B on A.nome = B.nome;