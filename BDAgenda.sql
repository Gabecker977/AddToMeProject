create database if not exists superBd;
use superBd;
create table if not exists users(
cod int(3) primary key auto_increment,
nome varchar(70) not null,
telefone varchar(17) not null,
telefone2 varchar(17),
data_de_nascimento date, 
endereço varchar(70), 
email varchar(70),
email2 varchar(70)
);
alter table users add senha varchar(8) not null;
insert into users(nome,telefone,data_de_nascimento) values("Gabriel",129984890,'2002-04-30');
create table if not exists contacts(
cod int(3) primary key auto_increment,
nome varchar(70) not null,
telefone varchar(17) not null,
telefone2 varchar(17),
data_de_nascimento date, 
endereço varchar(70), 
email varchar(70),
email2 varchar(70)
);
drop table users_contacts;
create table ucontactssers_contacts(
ins int,
userCod int(3),
contactCod int(3),
foreign key(userCod) references users(cod),
foreign key(contactCod) references contacts(cod)
)