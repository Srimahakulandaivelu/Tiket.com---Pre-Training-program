db.students.find(
  {
    courses:{
      $size:0
    }
  }
)