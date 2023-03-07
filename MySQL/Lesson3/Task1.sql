USE mydb;

CREATE TABLE weapon
(
	id int not null auto_increment primary key,
    name varchar(20)
);

CREATE TABLE soldier_who_give_weapon
(
	id int not null auto_increment primary key,
    first_name varchar (20),
    last_name varchar (20),
    surname varchar (20),
    rang varchar (20)
);

CREATE TABLE soldiers
(
	id int not null auto_increment,
    first_name varchar (20),
    last_name varchar (20),
    surname varchar (20),
    office_number int default null,
    weapon int not null,
    platoon int,
    id_soldier_who_give_weapon int not null,
    foreign key (weapon) references weapon(id),
    foreign key(id_soldier_who_give_weapon) references soldier_who_give_weapon(id),
    primary key (id)
);

INSERT weapon (name)
VALUES
("AK-47"),
("Глок20"),
("АК-74");

INSERT soldier_who_give_weapon (first_name, last_name, surname, rang)
VALUES
("Олександр", "Буров", "Сергійович", "майор"),
("Назар", "Рибаков", "Григорович", "майор"),
("Вадим", "Деребанов", "Ярославович", "підполковник");

INSERT soldiers (first_name, last_name, surname, office_number, weapon, platoon, id_soldier_who_give_weapon)
VALUES
("Володимир", "Петров", "Анатолійович", 205, 1, 222, 1),
("Володимир", "Петров", "Анатолійович", 205, 2, 222, 2),
("Петро", "Лодарев", "Сергійович", 221, 3, 232, 3),
("Петро", "Лодарев", "Сергійович", 221, 2, 232, 2),
("Костянитин", "Леонтьєв", "Вадимович", 201, 1, 212, 1),
("Костянитин", "Леонтьєв", "Вадимович", 201, 2, 212, 2),
("Роман", "Духов", "Миколайович", default, 1, 200, 1);
