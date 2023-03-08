USE myjoinsdb;

SELECT last_name, first_name, phone, place_of_residence FROM employees
INNER JOIN personal_info
ON personal_info.id_employee = employees.id;