db.students.find({
  name:"Arun"
})

//output
// [
//   {
//     _id: 1,
//     name: 'Arun',
//     age: 20,
//     phone: '1234567890',
//     address: {
//       doorNo: '12A',
//       street: 'MG Road',
//       city: 'Chennai',
//       state: 'Tamil Nadu',
//       pincode: '600001'
//     },
//     courses: [
//       { courseId: 101, courseName: 'MongoDB' },
//       { courseId: 102, courseName: 'Java' }
//     ],
//     marks: [
//       { courseId: 101, courseName: 'MongoDB', marks: 95 },
//       { courseId: 102, courseName: 'Java', marks: 88 }
//     ]
//   }
// ]