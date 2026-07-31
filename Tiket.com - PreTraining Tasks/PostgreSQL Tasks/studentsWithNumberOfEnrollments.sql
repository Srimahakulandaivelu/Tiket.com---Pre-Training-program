select s.name,
       count(e.course_id) as total_courses
from student s
         left join enrollment e
                   on s.id = e.student_id
group by s.name;

-- output
--  name  | total_courses
-- -------+---------------
--  Rahul |             0
--  Arun  |             2
--  Priya |             3
-- (3 rows)
