db.students.updateOne(
  {_id:1},
  {
  $set:{
    "address.city" : "bangalore"
  }
  }
)