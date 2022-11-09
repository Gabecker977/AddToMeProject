create database if not exists superBd;
use superBd;
create table if not exists users(
cod int(3) primary key auto_increment,
nome varchar(30) not null,
data_de_nascimento date, 
endereço varchar(70), 

email varchar(70),
emailS varchar(70)
);
insert into users(nome,telefones) values("Gabriel",129984890);
alter table users add telefone2 varchar(17);
alter table users drop telefones;