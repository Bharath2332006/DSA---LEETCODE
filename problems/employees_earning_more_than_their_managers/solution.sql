# Write your MySQL query statement below
Select e2.name as Employee 
from Employee e1
Inner join Employee e2
On e2.managerID=e1.id
where e1.salary<e2.salary;
