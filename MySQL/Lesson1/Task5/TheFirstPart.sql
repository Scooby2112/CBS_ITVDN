CREATE DATABASE cars;

USE cars;

CREATE TABLE INFO
(
	id int auto_increment not null,
	mark varchar(15),
    model varchar(20),
    engineCapacity double,
    price int,
    maxSpeed int,
    PRIMARY KEY (id)
);
