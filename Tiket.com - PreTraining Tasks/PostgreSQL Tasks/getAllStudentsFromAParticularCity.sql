select s.*
from student s
         join address a
              on s.id = a.student_id
where a.city = 'Chennai';

-- output
-- id | name  |      email      |   phone
-- ----+-------+-----------------+------------
--   2 | Priya | priya@gmail.com | 9123456789
-- (1 row)