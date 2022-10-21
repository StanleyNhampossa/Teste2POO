drop database if exists teste2poo;
create database if not exists teste2poo;
use teste2poo;
create table usuario(
	id int not null auto_increment,
    nome varchar(150),
    email varchar(150),
    nomeUsuario varchar(150),
    dataDeNascimento date,
    contacto bigint,
    biografia varchar(150),
    senha varchar(150),
    
    
    
    
    primary key(id)
);

create table currentuser(
	id int not null auto_increment primary key,
    nome varchar(150),
    senha varchar(150),
    MetodoDeRecuperarSenha varchar(150),
    Resposta varchar(150)
    
);