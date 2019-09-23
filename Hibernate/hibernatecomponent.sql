drop database if exists hibernatecomponent;
create database hibernatecomponent;
use hibernatecomponent;

create table emp(id int not null primary key,name varchar(25),city varchar(20),state varchar(20),country varchar(25));

INSERT INTO `emp` VALUES (1,'Rohit','shimla','Himachl Pradesh','India'),(2,'Dinesh','patiala','Punjab','India');
