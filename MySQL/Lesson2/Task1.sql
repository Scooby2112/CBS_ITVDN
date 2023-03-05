CREATE DATABASE Wholesale_Warhouse;

USE wholesale_warhouse;

CREATE Table suppliers
(
	id_supplier int auto_increment not null,
    name_IE varchar(40),
    address_of_suppliers varchar(50) default "Unknown",
    index_of_suppliers int not null,
    phone_of_supplier varchar (13) default "Unknown",
    PRIMARY KEY (id_supplier)
);

CREATE Table customers
(
	id_customer int auto_increment not null,
    FAQ varchar (40),
    address_of_customer varchar (50) default "Unknown",
    index_of_customer int not null,
    phone_of_customer varchar (13) default "Unknown",
    PRIMARY KEY (id_customer)
);

CREATE Table delivered_goods
(
	id_goods int auto_increment not null,
    supplier_id int not null,
    name_of_goods varchar (30),
    quantity_of_goods int not null,
    unit_price double not null,
    total double not null,
    FOREIGN KEY (supplier_id) references suppliers(id_supplier),
    PRIMARY KEY (id_goods)
);

CREATE Table sold_goods
(
	id_goods int auto_increment not null,
    customer_id int not null,
    name_of_goods varchar(30),
    quantity_of_goods int not null,
    unit_price double not null,
    total double not null,
    FOREIGN KEY (customer_id) references customers(id_customer),
    PRIMARY KEY (id_goods)
);

CREATE Table employees
(
	id_employees int auto_increment not null,
    FAQ varchar (30),
    age int not null,
    position varchar(25),
	experience varchar(15) default "Doesn't have",
    PRIMARY KEY (id_employees)
);

INSERT INTO suppliers
(name_IE, address_of_suppliers, index_of_suppliers, phone_of_supplier)
VALUES
("ФОП Петренко В.В.", "м.Київ, вул. Зоряна, 5", "25333", "+380988855645"),
("ФОП Васільєв О.С.", "м.Бровари вул. Маршала Тіча, 3/4", "11932", "+380986545265"),
("ФОП Курган Д.В.", "м.Дніпро, вул. Ломносова, 69", "22330", "+380504545689");

INSERT INTO customers
(FAQ, address_of_customer, index_of_customer, phone_of_customer)
VALUES
("Пономаренко А.С.", "м. Київ вул. Миру 72б", "19234", "+380660555541"),
("Осадченко В.П.", "м. Київ вул. Саксаганського 8", "81211", "+38990999889"),
("Тростенко А.Р.", "м. Харків вул. Дрожича 19", "54325", "+380688484598");

INSERT INTO delivered_goods
(supplier_id, name_of_goods, quantity_of_goods, unit_price, total)
VALUES
(1, "Washing machine LG A515", 5, 18000, 90000),
(1, "Dishwasher LG B2221", 5, 10000, 50000),
(3, "Acer Aspire A515G", 3, 21000, 63000),
(2, "Power Supply ATX GM-500W", 4, 990, 3960);

INSERT INTO sold_goods
(customer_id, name_of_goods, quantity_of_goods, unit_price, total)
VALUES
(2, "Washing machine LG A515", 2, 18000, 36000),
(2, "Dishwasher LG B2221", 1, 10000, 10000),
(1, "Acer Aspire A515G", 1, 21000, 21000),
(1, "Power Supply ATX GM-500W", 1, 990, 990),
(3, "Washing machine LG A515", 1, 18000, 18000),
(3, "Dishwasher LG B2221", 1, 10000, 10000),
(3, "Acer Aspire A515G", 1, 21000, 21000),
(3, "Power Supply ATX GM-500W", 1, 990, 990);

INSERT INTO employees
(FAQ, age, position, experience)
VALUES
("Антонов В.А.", 26, "Кладовщик", "2 роки"),
("Оксенич В.В.", 21, "Адмімінстратор", "1 рік"),
("Бородяник А.А.", 31, "Менеджер", "8 років");

SELECT * FROM sold_goods;
SELECT * FROM delivered_goods;
SELECT * FROM employees;
