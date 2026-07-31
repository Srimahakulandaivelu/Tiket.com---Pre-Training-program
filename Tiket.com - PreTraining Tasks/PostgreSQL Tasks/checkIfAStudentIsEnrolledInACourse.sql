select *
from enrollment
where student_id = 1
  and course_id = 102;

-- output
-- student_id | course_id
-- ------------+-----------
--           1 |       102
-- (1 row)