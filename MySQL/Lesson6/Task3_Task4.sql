USE myjoinsdb;

CREATE INDEX employees ON employees (id);

CREATE VIEW firstview
AS SELECT id as id_employee, phone, place_of_residence FROM employees
INNER JOIN personal_info
ON id = id_employee;

CREATE VIEW secondview
AS SELECT id as id_employee, date_of_birth, phone FROM employees
INNER JOIN personal_info
ON id = id_employee
WHERE marital_status = "not married";

CREATE VIEW thirdview
AS SELECT id as id_employee, date_of_birth, phone FROM Employees
INNER JOIN personal_info
ON Employees.id = personal_info.id_employee
WHERE id_position = 3;