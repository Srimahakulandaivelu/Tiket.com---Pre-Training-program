db.students.find(
  {
    "marks.marks":{
      $gt:90
    }
  }
)
