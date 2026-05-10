function sc(floor){
    let scrim = "";
    const wordFirst = "Aa~ ";
    const wordSecond = "Pa!";
    const wordTherd = " Aa!";
​
    if (floor <= 1) {return ""};
    if (floor >= 2 && floor <= 6) {
        scrim += wordFirst.repeat(floor - 1) + wordSecond + wordTherd;
    } else {
        scrim += wordFirst.repeat(floor - 1) + wordSecond;
    }
  return scrim;
};
​