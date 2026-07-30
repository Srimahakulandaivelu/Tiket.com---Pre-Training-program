function repeatStringNumTimes(str, num) {
  let s = "";
  if(num <= 0) return s;

  for(let i=0;i<num;i++){
    s+=str;
  }

  return s;
}

repeatStringNumTimes('abc', 3);