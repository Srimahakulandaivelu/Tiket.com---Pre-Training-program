function splitify(str) {
  // Only change code below this line

return str.split(/\W+/).filter(Boolean);
  // Only change code above this line
}

splitify("Hello World,I-am code");