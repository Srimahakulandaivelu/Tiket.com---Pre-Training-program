select student_id,
       avg(score) as avg_marks
from marks
group by student_id;

-- output
-- student_id |      avg_marks
-- ------------+---------------------
--           2 | 91.0000000000000000
--           1 | 90.6666666666666667
-- (2 rows)