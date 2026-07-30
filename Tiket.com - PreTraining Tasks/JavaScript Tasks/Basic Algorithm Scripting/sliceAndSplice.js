function frankenSplice(arr1, arr2, n) {
  let leftSide = arr2.slice(0, n);
  let rightSide = arr2.slice(n);

  return leftSide.concat(arr1, rightSide);
}

frankenSplice([1, 2, 3], [4, 5, 6], 1);