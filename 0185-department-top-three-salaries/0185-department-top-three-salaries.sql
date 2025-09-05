select e.name as Employee,
d.name as Department,
e.salary as salary
from( select departmentId,name,salary, dense_rank() over(partition by departmentId order by salary desc ) as rnk from Employee) e join Department d on e.departmentId=d.id where rnk<=3;