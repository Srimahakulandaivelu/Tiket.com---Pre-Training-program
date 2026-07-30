function sentensify(str) {
  // Only change code below this line
  const s = str.split(/\W+/).filter(Boolean);

  return s.join(" ");

  // Only change code above this line
}

sentensify("May-the-force-be-with-you");