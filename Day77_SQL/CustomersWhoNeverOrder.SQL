# Write your MySQL query statement below
SELECT name as Customers FROM Customers
WHERE id NOT in (SELECT customerId FROM Orders);