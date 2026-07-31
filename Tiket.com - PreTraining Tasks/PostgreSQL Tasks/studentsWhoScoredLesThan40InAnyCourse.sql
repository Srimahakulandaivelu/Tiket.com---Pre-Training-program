select distinct s.*
from student s
         join marks m
              on s.id = m.student_id
where m.score<40;


-- output
-- id | name | email | phone | graduated
-- ----+------+-------+-------+-----------
-- (0 rows)