select distinct s.*
from student s
         join marks m
              on s.id = m.student_id
where m.score > 90;

-- output
--  id | name  |      email      |    phone    | graduated
-- ----+-------+-----------------+-------------+-----------
--   2 | Priya | priya@gmail.com | 9123456789  | f
--   1 | Arun  | arun@gmail.com  | 99999999999 | f
-- (2 rows)