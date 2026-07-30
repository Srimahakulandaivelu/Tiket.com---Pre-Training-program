function confirmEnding(str, target) {
  let i = str.length-1;
  let j = target.length-1;

  while(j>=0 && str[i] === target[j]){
    i--;
    j--;
  }

  if(j == -1) return true;
  return false;
}

confirmEnding('Bastian', 'n');