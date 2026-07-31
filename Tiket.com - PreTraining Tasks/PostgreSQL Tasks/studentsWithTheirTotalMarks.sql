select s.name,
       sum(m.score) as total_marks
from student s
         left join marks m
                   on s.id = m.student_id
group by s.name;

-- output
--  name  | total_marks
-- -------+-------------
--  Rahul |
--  Arun  |         272
--  Priya |          91
-- (3 rows)
