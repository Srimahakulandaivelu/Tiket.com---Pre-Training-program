db.students.updateOne(
  {_id:1},
  {
    $set:{
      phone:"9999999999"
    }
  }
)