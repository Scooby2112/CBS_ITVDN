USE human_resources_department_2;

DROP TABLE IF EXISTS positions;
CREATE Table positions
(
	position_code int not null auto_increment,
    job_title varchar(30),
    salary double not null,
    PRIMARY KEY (position_code)
);

DROP TABLE IF exists applicants;
CREATE Table applicants
(
	id_applicant int not null auto_increment,
    last_name varchar(20),
    first_name varchar(20),
    surname varchar (20),
    education varchar (20),
    date_of_birth date,
    address varchar(35),
    phone varchar(13),
    position_code int not null,
    FOREIGN KEY(position_code) references positions(position_code),
    PRIMARY KEY (id_applicant)
);

DROP TABLE IF exists about_personnel;
CREATE Table about_personnel
(
	roll_number int not null auto_increment,
    last_name varchar(15),
    first_name varchar(15),
    surname varchar(15),
    date_of_birth date,
    passport_number int not null,
	education varchar(20),
    date_of_acceptance date,
    position_code int not null,
    FOREIGN KEY (position_code) references positions(position_code),
    PRIMARY KEY (roll_number)
);

INSERT INTO positions
(job_title, salary)
VALUES
("Програміст", 50000),
("Тестувальник", 35000),
("Менеджер", 25000),
("Адміністратор", 21000);

INSERT INTO applicants
(last_name, first_name, surname, education, date_of_birth, address, phone, position_code)
VALUES
("Петренко", "Василь", "Васильович", "Вища освіта", '1999-05-19', "м.Київ, вул. Зоряна, 5", "+380988855645", 3),
("Васільєв", "Олександр", "Сергійович", "Середня освіта", '2002-08-22', "м.Бровари вул. Маршала Тіча, 3/4", "+380986545265", 2),
("Курган", "Дмитро", "Валерійович", "Вища освіта", '1992-03-01', "м.Дніпро, вул. Ломносова, 69", "+380504545689", 3),
("Пономаренко", "Анатолій", "Семенович", "Вища освіта", '1995-06-29', "м. Київ вул. Миру 72б", "+380660555541", 4),
("Осадченко", "Володимир", "Петрович", "Середня освіта", '1990-12-02', "м. Київ вул. Саксаганського 8", "+38990999889", 1),
("Тростенко", "Артур", "Русланович", "Вища освіта", '2000-03-03', "м. Харків вул. Дрожича 19", "380688484598", 1);

INSERT INTO about_personnel
(last_name, first_name, surname, date_of_birth, passport_number, education, date_of_acceptance, position_code)
VALUES
( "Полякова", "Ганна", "Семенівна", '1986-09-03', "005454568", "Вища освіта", '2005-09-19', 1),
("Петров", "Антон", "Сергійович", '1986-08-12', "005858965", "Вища освіта", '2009-04-12', 4),
("Іванов", "Петро", "Михайлович", '1981-09-15', "004141568", "Вища освіта", '2006-12-21', 2),
("Сидоров", "Михайло", "Васильович", '1978-10-26', "008585647", "Вища освіта", '2000-10-05', 4),
("Корольов", "Олександр", "Олександрович", '1988-04-17', "004545685", "Вища освіта", '2010-11-27', 3);

SELECT applicants.last_name, applicants.first_name, applicants.education, applicants.phone, positions.job_title FROM applicants
INNER JOIN positions ON applicants.position_code = positions.position_code;

SELECT about_personnel.roll_number, about_personnel.last_name, about_personnel.first_name, about_personnel.surname, positions.job_title FROM about_personnel
INNER JOIN positions ON about_personnel.position_code = positions.position_code;