create database exemplo;

use exemplo;

create table venda (
id integer not null auto_increment,
data date,

constraint PK_VENDA primary key(id)
);

create table produto (
id integer not null auto_increment,
nome varchar(40) not null,
valor double not null,

constraint PK_PRODUTO primary key(id)
);

drop table venda_produto;
create table venda_produto (
id_venda integer not null,
id_produto integer not null,
qnt integer,
valor double,

constraint FK_VENDA foreign key(id_venda) references venda(id)
);

insert into venda (data) values ('2022-06-03');
insert into venda (data) values ('2022-06-01');


insert into produto (nome, valor) values ('Agua', 20);
insert into produto (nome, valor) values ('Cerveja', 5);

insert into venda_produto (id_venda, id_produto, qnt, valor) values (1, 1, 3, 40);

select * from venda_produto;

select * from venda;

select SUM(venda_produto.qnt * venda_produto.valor) FROM venda_produto where id_venda=1;

select produto.qnt  produto.valor venda where id=1;