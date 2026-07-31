select student_id,
       count(course_id) as total_courses
from enrollment
group by student_id
having count(course_id) > 3;

-- output
-- student_id | total_courses
-- ------------+---------------
-- (0 rows)
