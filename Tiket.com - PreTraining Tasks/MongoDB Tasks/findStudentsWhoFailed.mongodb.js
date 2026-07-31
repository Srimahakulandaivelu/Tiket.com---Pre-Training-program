db.students.find(
  {
    "marks.marks":{
      $lt:40
    }
  }
)