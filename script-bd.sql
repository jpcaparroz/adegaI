create database testes_adegai;

use testes_adegai;

create table cliente (
id integer not null auto_increment,
nome varchar(80) not null,
constraint PK_CLIENTE primary key(id)
);

create table funcionario (
id integer not null auto_increment,
nome varchar(80) not null,
login varchar(40) not null unique,
senha varchar(40) not null ,
admin boolean not null default(0),

constraint PK_FUNCIONARIO primary key(id)
);

create table venda (
id integer not null auto_increment,
data date not null,
valor double not null,

constraint PK_VENDA primary key(id)
);

create table produto (
id integer not null auto_increment,
nome varchar(80) not null,
valor double not null,
quantidade int not null,

constraint PK_PRODUTO primary key(id)
);

INSERT INTO funcionario (nome,login,senha) values ('joao', 'jota', '123');

INSERT INTO cliente (nome) values ('attilio');

INSERT INTO funcionario (nome,login,senha, admin) values ('joao', 'jotinha', '321', 1);

INSERT INTO produto (nome,valor,quantidade) values ('Skol (350ml)', 2.5, 5);

DELETE FROM funcionario WHERE id=31;

DELETE FROM cliente WHERE id=14;

select * from funcionario;

select * from produto;

SELECT * FROM funcionario WHERE login='pedro';

select * from cliente;

UPDATE funcionario SET nome= 'Pedro' where id=7;

UPDATE produto SET quantidade=10 WHERE nome='Skol (350ml)';