use myjoinsdb;

SELECT last_name as LName, first_name as FName, phone as PhoneNumber,
	(SELECT place_of_residence
	FROM personal_info
	WHERE personal_info.id_employee = employees.id) as Location
FROM employees;

SELECT (SELECT last_name FROM employees WHERE personal_info.id_employee = employees.id) as LName,
	(SELECT first_name FROM employees WHERE personal_info.id_employee = employees.id) as FName,
    (SELECT phone FROM employees WHERE personal_info.id_employee = employees.id) as PhoneNumber,
    date_of_birth as Birthday
FROM personal_info
WHERE marital_status = 'not married';

SELECT last_name as LName, first_name as FName, phone as PhoneNumber,
	(SELECT date_of_birth FROM personal_info WHERE personal_info.id_employee = employees.id) as Birthday
FROM employees
WHERE id_position = 3;