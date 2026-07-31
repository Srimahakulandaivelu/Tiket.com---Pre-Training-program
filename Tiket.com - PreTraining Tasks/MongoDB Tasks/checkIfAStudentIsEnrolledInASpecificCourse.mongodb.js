db.students.find(
  {
    _id:1,
    "courses.courseName":"Java"
  }
)