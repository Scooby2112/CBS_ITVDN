DROP Database myjoinsdb;

create database myjoinsdb;

use myjoinsdb;

create table positions(	
	id_position int not null auto_increment primary key,
	position varchar(40),
    salary double not null	);

create table employees(	
	id int not null auto_increment primary key,
    last_name varchar(20),
    first_name varchar(20),
    surname varchar(20),
    phone varchar(13),
    id_position int not null,
    foreign key (id_position) references positions(id_position)	);
    
create table about_employees(	
	id_employee int not null,
	foreign key (id_employee) references employees(id),
    marital_status varchar(15),
    birthday date,
    location varchar(50)	);
    
INSERT positions (position, salary)
VALUES
("Головний директор", 50000),
("Робочий", 35000),
("Менеджер", 25000);
    
INSERT employees (last_name, first_name, surname, phone, id_position)
VALUES
("Петренко", "Василь", "Васильович", "+380988855645", 3),
("Васільєв", "Олександр", "Сергійович", "+380986545265", 2),
("Курган", "Дмитро", "Валерійович", "+380504545689", 2),
("Пономаренко", "Анатолій", "Семенович", "+380660555541", 2),
("Осадченко", "Володимир", "Петрович", "+38990999889", 3),
("Тростенко", "Артур", "Русланович", "+380688484598", 1);

INSERT about_employees (id_employee, marital_status, birthday, location)
VALUES
(1, "not married", '1999-05-19', "м.Київ, вул. Зоряна, 5"),
(2, "married", '2002-08-22', "м.Бровари вул. Маршала Тіча, 3/4"),
(3, "married", '1992-03-01', "м.Дніпро, вул. Ломносова, 69"),
(4, "not married", '1995-06-29', "м. Київ вул. Миру 72б"),
(5, "married", '1990-12-02', "м. Київ вул. Саксаганського 8"),
(6, "not married", '2000-03-03', "м. Харків вул. Дрожича 19");
    