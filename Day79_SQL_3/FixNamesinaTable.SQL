# Write your MySQL query statement below
SELECT user_id, concat(UCASE(SUBSTRING(name,1,1)),LCASE(SUBSTRING(name FROM 2))) as name
from Users order by user_id;