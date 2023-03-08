use ShopDB;

SELECT Employees.EmployeeID, Employees.FName as EmployeeFName, Employees.LName as EmployeeLName, Employees.MName as EmployeeMName,
 Customers.CustomerNo, Customers.FName as CustomerFName, Customers.LName as CustomerLName, Customers.MName as CustomerMName FROM Employees
INNER JOIN Orders
ON Employees.EmployeeID = Orders.EmployeeID
INNER JOIN Customers
ON customers.CustomerNo = orders.CustomerNo
INNER JOIN OrderDetails
ON orders.OrderID = orderdetails.OrderID
WHERE totalprice > 300