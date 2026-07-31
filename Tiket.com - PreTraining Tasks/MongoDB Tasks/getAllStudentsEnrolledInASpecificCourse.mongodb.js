db.students.find({
  "courses.courseName":"MongoDB"
},
{
  name : 1
}
)