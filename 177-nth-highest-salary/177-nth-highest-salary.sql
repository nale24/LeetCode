CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
set n = n - 1;
  RETURN (
      # Write your MySQL query statement below.
      ifnull(
          (select distinct Salary as getNthHighestSalary from Employee order by Salary desc limit n, 1), null)
);
END