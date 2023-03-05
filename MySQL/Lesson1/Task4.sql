USE mydb;

SELECT * FROM personalInformation;
UPDATE personalInformation 
SET maritalStatus = "married"
WHERE id = 1;

SELECT * FROM personalinformation