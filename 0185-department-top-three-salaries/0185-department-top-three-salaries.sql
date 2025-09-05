SELECT d.name AS Department,
e.name AS Employee,
e.salary AS Salary
from( 
    SELECT departmentId,name,salary, dense_rank() over (
        PARTITION BY departmentId ORDER BY salary desc) as rnk from Employee 
) e join Department d on d.id=e.departmentId where rnk<=3;