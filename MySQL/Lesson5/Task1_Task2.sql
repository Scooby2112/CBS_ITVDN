USE myjoinsdb;

    CREATE TABLE positions (
    id int not null auto_increment primary key,
    position varchar (20),
    salary double not null);
    
CREATE TABLE employees(
	id int not null auto_increment primary key,
    last_name varchar (20),
    first_name varchar (20),
    surname varchar (20),
    phone varchar (13) default "Unknown",
    id_position int not null,
    foreign key (id_position) references positions(id));
    
DROP TABLE personal_info;
CREATE TABLE personal_info (
	id_employee int not null,
    foreign key (id_employee) references employees (id),
    marital_status varchar(20),
    date_of_birth date,
    place_of_residence varchar (35));
    
INSERT positions (position, salary)
VALUES
("Програміст", 50000),
("Тестувальник", 35000),
("Менеджер", 25000),
("Адміністратор", 21000);

INSERT employees (last_name, first_name, surname, phone, id_position)
VALUES
("Петренко", "Василь", "Васильович", "+380988855645", 3),
("Васільєв", "Олександр", "Сергійович", "+380986545265", 2),
("Курган", "Дмитро", "Валерійович", "+380504545689", 3),
("Пономаренко", "Анатолій", "Семенович", "+380660555541", 4),
("Осадченко", "Володимир", "Петрович", "+38990999889", 1),
("Тростенко", "Артур", "Русланович", "+380688484598", 1);

INSERT personal_info (id_employee, marital_status, date_of_birth, place_of_residence)
VALUES
(1, "not married", '1999-05-19', "м.Київ, вул. Зоряна, 5"),
(2, "married", '2002-08-22', "м.Бровари вул. Маршала Тіча, 3/4"),
(3, "married", '1992-03-01', "м.Дніпро, вул. Ломносова, 69"),
(4, "not married", '1995-06-29', "м. Київ вул. Миру 72б"),
(5, "married", '1990-12-02', "м. Київ вул. Саксаганського 8"),
(6, "not married", '2000-03-03', "м. Харків вул. Дрожича 19");
