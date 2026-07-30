// Only change code below this line
function urlSlug(title) {
  const s = title.toLowerCase().split(" ").filter(Boolean);

  return s.join("-");

}
// Only change code above this line
urlSlug("A Mind Needs Books Like A Sword Needs A Whetstone");