select s.name, m.score
from student s
         join marks m
              on s.id = m.student_id
where m.course_id = 101
order by m.score desc
    limit 3;

-- output
--  name  | score
-- -------+-------
--  Arun  |    95
--  Priya |    91
-- (2 rows)