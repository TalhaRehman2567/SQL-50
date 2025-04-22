# Write your MySQL query statement below
SELECT MAX(NUM) AS num from
(
    select num
    from
    mynumbers
    group by num
    having count(num) = 1 
) as new_table