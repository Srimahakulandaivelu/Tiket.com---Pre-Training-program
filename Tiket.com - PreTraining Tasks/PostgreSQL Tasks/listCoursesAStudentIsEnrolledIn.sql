select c.*
from course c
         join enrollment e
              on c.id = e.course_id
where e.student_id=1;


-- output
--  id  |  name   |     description
-- -----+---------+----------------------
--  101 | MongoDB | NoSQL Database
--  102 | Java    | Programming Language
--  104 | NodeJS  | Backend Development
-- (3 rows)