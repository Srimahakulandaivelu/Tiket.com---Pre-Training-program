select s.*
from student s
join enrollment e
on s.id = e.student_id
join course c
on c.id = e.course_id
where c.name = 'MongoDB';

-- output
--  id | name  |      email      |    phone
-- ----+-------+-----------------+-------------
--   1 | Arun  | arun@gmail.com  | 99999999999
--   2 | Priya | priya@gmail.com | 9123456789
-- (2 rows)