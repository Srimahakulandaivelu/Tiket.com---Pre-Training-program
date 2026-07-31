select *
from student
where id not in
      (
          select student_id
          from enrollment
      );

-- output
-- id | name  |      email      |   phone    | graduated
-- ----+-------+-----------------+------------+-----------
--   3 | Rahul | rahul@gmail.com | 9988776655 | f
-- (1 row)
