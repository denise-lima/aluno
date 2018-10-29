create database Aluno;
use Aluno;
create table Aluno(
	id int auto_increment primary key,
    nome varchar(100),
    idade int,
    endereco varchar (100)
);
use Aluno;
INSERT INTO `Aluno` (`id`,`nome`,`idade`,`endereco`) VALUES (1,'Carlos Drummond de Andrade','18','rua sao judas');
INSERT INTO `aluno` (`id`,`nome`,`idade`,`endereco`) VALUES (2,'Manuel Bandeira','18','rua deni');
INSERT INTO `aluno` (`id`,`nome`,`idade`,`endereco`) VALUES (3,'Olavo Bilac','18','rua favela');

