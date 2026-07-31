db.students.aggregate([
  {
    $match:{_id:1}
  },
  {
    $unwind:"$marks"
  },
  {
    $group:{
      _id:"$name",
      averageMarks:{
        $avg: "$marks.marks"
      }
    }
  }
])