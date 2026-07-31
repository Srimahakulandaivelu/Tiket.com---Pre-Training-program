db.students.updateOne(
  {_id:4},
  {
    $set:{
      address:{
        doorNo:"18",
        street:"Gandhi Road",
        city:"Madurai",
        state:"Tamil Nadu",
        pincode:"625001"
      }
    }
  }
)