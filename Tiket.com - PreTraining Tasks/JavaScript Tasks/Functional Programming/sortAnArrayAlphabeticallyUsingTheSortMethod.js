function alphabeticalOrder(arr) {
  // Only change code below this line

  return arr.sort(function(a, b){
    return a.localeCompare(b);
  });
  // Only change code above this line
}

alphabeticalOrder(["a", "d", "c", "a", "z", "g"]);