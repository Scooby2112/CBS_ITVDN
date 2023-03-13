use shopdb;

SELECT (SELECT LName FROM Employees 
		WHERE EmployeeID = (SELECT employeeID FROM Orders
							WHERE Orders.OrderID = OrderDetails.OrderID)
	) as LNameEmploy,
	(SELECT FName FROM Employees 
    WHERE EmployeeID = (SELECT employeeID FROM Orders
						WHERE Orders.OrderID = OrderDetails.OrderID)
	) as FNameEmploy,
    (SELECT LName FROM Customers 
    WHERE CustomerNo = (SELECT CustomerNo FROM Orders
						WHERE Orders.OrderID = OrderDetails.OrderID)
	) as LNameCust,
    (SELECT FName FROM Customers 
   WHERE CustomerNo = (SELECT CustomerNo FROM Orders
						WHERE Orders.OrderID = OrderDetails.OrderID)
	) as FNameCust
FROM Orderdetails
WHERE totalPrice >500