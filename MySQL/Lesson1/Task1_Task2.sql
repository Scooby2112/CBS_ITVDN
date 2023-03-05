DROP DATABASE MyDB;

CREATE DATABASE MyDB;

USE MyDB;




CREATE Table nameAndPhone
(
	id INT AUTO_INCREMENT NOT NULL,
	firstName VARCHAR(30),
    lastName VARCHAR(30),
    phoneNumber VARCHAR(12),
    PRIMARY KEY (id)
);

CREATE Table salaryAndPosition
(
	id int NOT NULL,
	salary int NOT NULL,
    positionOfWork VARCHAR(30),
     PRIMARY KEY (id)
);

CREATE Table personalInformation
(
	id int NOT NULL,
	maritalStatus VARCHAR(20),
    dateOfBirth VARCHAR(10),
    placeOfResidence VARCHAR(50),
     PRIMARY KEY (id)
);


INSERT INTO nameAndPhone
(firstName, lastName, phoneNumber)
VALUES 
("Andrew", "Smith", "380505554848");

INSERT INTO nameAndPhone
(firstName, lastName, phoneNumber)
VALUES
("Andrew", "Garfield", "380988877565");

INSERT INTO nameAndPhone
(firstName, lastName, phoneNumber)
VALUES
("Tom", "Hardy", "380630555444");

INSERT INTO salaryAndPosition
(id, salary, positionOfWork)
VALUE
(1, 15000, "Shop Assistant");

INSERT INTO salaryAndPosition
(id, salary, positionOfWork)
VALUE
(2, 12000, "Psychologist");

INSERT INTO salaryAndPosition
(id, salary, positionOfWork)
VALUE
(3, 8000, "Egineer");

INSERT INTO personalInformation
(id, maritalStatus, dateOfBirth, placeOfResidence)
VALUE
(1, "not married", "16.05.1996", "Ukraine, Kyiv");

INSERT INTO personalInformation
(id, maritalStatus, dateOfBirth, placeOfResidence)
VALUE
(2, "married", "05.03.1992", "UK, London");

INSERT INTO personalInformation
(id, maritalStatus, dateOfBirth, placeOfResidence)
VALUE
(3,"not married", "28.01.2000", "USA, California");