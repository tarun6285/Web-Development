drop database if exists hibernatedemo;
create database hibernatedemo;
use hibernatedemo;

DROP TABLE IF EXISTS `list`;

CREATE TABLE `list` (
  `id` int(11) NOT NULL,
  `name` varchar(20) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO `list` VALUES (201,'Anil',22);
INSERT INTO `list` VALUES (202,'Aviral',23);
INSERT INTO `list` VALUES (203,'Rohan',20);
INSERT INTO `list` VALUES (204,'Sohan',31); 
INSERT INTO `list` VALUES (205,'Sohail',23);
INSERT INTO `list` VALUES (206,'Minkush',32);
INSERT INTO `list` VALUES (207,'Rakesh',19);
INSERT INTO `list` VALUES (208,'Mukesh',21); 
INSERT INTO `list` VALUES (209,'Akhil',22);
INSERT INTO `list` VALUES (210,'Rakesh',28);

