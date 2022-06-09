-- CRIANDO BANCO ADEGAI
create database testes_adegai;
use testes_adegai;

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

create table produto (
id integer not null auto_increment,
nome varchar(80) not null unique,
valor double not null,
quantidade int not null,
tipo varchar(20) not null,

constraint PK_PRODUTO primary key(id)
);

create table venda (
id integer not null auto_increment,
data date not null,
valor double not null,
id_cliente integer not null,
id_funcionario integer not null,

constraint PK_VENDA primary key(id),
constraint FK_CLIENTE foreign key(id_cliente) references cliente(id),
constraint FK_FUNCIONARIO foreign key(id_funcionario) references funcionario(id)
);

create table venda_produto (
	id_venda integer not null,
    id_produto integer not null,
	quantidade integer not null,
    
	constraint FK_VENDA foreign key(id_venda) references venda(id),
	constraint FK_PRODUTO foreign key (id_produto) references produto(id)
);

-- CRIANDO USUÁRIO PARA ACESSAR O SISTEMA
INSERT INTO funcionario (nome, login, senha, admin) value ('teste', 'admin', 'admin', 1);
