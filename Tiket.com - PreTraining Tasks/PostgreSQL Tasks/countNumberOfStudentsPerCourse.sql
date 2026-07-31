select c.name, count(e.student_id) as total_students
from course c
         left join enrollment e
                   on c.id = e.course_id
group by c.name;

-- output
--   name   | total_students
-- ---------+----------------
--  Python  |              0
--  NodeJS  |              0
--  Java    |              1
--  MongoDB |              2
-- (4 rows)