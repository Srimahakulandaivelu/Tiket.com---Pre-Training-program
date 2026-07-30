function largestOfFour(arr) {

  let ans = [];

  for(let i=0;i<4;i++){
    let largest = arr[i][0];
    for(let j=0;j<arr[i].length;j++){
      if(largest < arr[i][j]){
        largest = arr[i][j];
      }
    }
    ans.push(largest);
  }
  return ans;
}

largestOfFour([
  [4, 5, 1, 3],
  [13, 27, 18, 26],
  [32, 35, 37, 39],
  [1000, 1001, 857, 1]
]);