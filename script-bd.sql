-- CRIANDO BANCO ADEGAI
create database testes_adegai;

-- CRIANDO TABELAS
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

drop table venda;
create table venda (
id integer not null auto_increment,
data date not null,
id_cliente integer not null,

constraint PK_VENDA primary key(id),
constraint FK_CLIENTE foreign key(id_cliente) references cliente(id)
);

create table produto (
id integer not null auto_increment,
nome varchar(80) not null unique,
valor double not null,
quantidade int not null,
tipo varchar(20) not null,

constraint PK_PRODUTO primary key(id)
);

drop table venda_produto;
create table venda_produto (
	id integer not null auto_increment,
    valor double not null,
	id_produto integer not null,
	id_venda integer not null,

	constraint PK_VENDA_PRODUTO primary key(id),
	constraint FK_VENDA foreign key(id_venda) references venda(id),
	constraint FK_PRODUTO foreign key (id_produto) references produto(id)
);

INSERT INTO venda (id_produto, id_venda) VALUE (12, 2);

INSERT INTO venda (data, id_cliente) value ('2022-06-03', 2);

INSERT INTO venda_produto (valor, id_produto, id_venda) value (500, 12, 1);

INSERT INTO venda_produto set id=1 value 






INSERT INTO funcionario (nome,login,senha) values ('joao', 'jota', '123');

INSERT INTO cliente (nome) values ('attilio');

INSERT INTO funcionario (nome,login,senha, admin) values ('joao', 'jotinha', '321', 1);

INSERT INTO produto (nome,valor,quantidade) values ('Skol (350ml)', 2.5, 5);

DELETE FROM funcionario WHERE id=31;

DELETE FROM cliente WHERE nome='attilio';

select * from cliente;

select * from produto;

select * from funcionario;

SELECT quantidade FROM produto WHERE nome ='Kecthup';

SELECT * FROM funcionario WHERE login='pedro';

SELECT COUNT(*) AS total FROM produto;

SELECT * FROM funcionario WHERE admin=0;

SELECT COUNT(*) AS total FROM cliente WHERE admin=0;

UPDATE funcionario SET nome= 'Pedro' where id=7;

UPDATE produto SET quantidade=15 WHERE nome='Skol (350ml)';
