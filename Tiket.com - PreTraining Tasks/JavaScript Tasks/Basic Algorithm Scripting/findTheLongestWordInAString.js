function findLongestWordLength(str) {
  let arr = str.split(" ");
  let maxlength = 0;

  for(let i=0;i<arr.length;i++){
    if(maxlength < arr[i].length){
      maxlength = arr[i].length;
    }
  }
  return maxlength;
}

findLongestWordLength('The quick brown fox jumped over the lazy dog');