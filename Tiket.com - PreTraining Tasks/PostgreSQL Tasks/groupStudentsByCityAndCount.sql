select city,
       count(student_id) as total_students
from address
group by city;

-- output
--  city    | total_students
-- ------------+----------------
--  Chennai    |              1
--  Bangalore  |              1
--  Coimbatore |              1
-- (3 rows)