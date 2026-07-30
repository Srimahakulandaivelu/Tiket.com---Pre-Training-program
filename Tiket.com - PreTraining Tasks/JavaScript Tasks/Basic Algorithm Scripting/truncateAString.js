function truncateString(str, num) {
  if(str.length <= num) return str;

  let s = "";
  for(let i=0;i<num;i++){
    s += str[i];
  }

  return s += "...";
}

truncateString('A-tisket a-tasket A green and yellow basket', 8);