function chunkArrayInGroups(arr, size) {
  let ans = [];
  let i=0;

  while(i < arr.length){
    ans.push(arr.slice(i, i+size));
    i+=size;
  }


  return ans;
}

chunkArrayInGroups(['a', 'b', 'c', 'd'], 2);