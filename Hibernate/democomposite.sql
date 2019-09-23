drop database if exists hibernate_composite;
create database hibernate_composite;
use hibernate_composite;

CREATE TABLE  empdept (
  empId int(11) NOT NULL,
  deptId int(11) NOT NULL,
  role varchar(100) NOT NULL,
  PRIMARY KEY (empId,deptId)
) ENGINE=InnoDB;
