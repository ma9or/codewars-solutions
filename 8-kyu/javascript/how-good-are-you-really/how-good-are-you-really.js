function betterThanAverage(classPoints, yourPoints) {
  let count = 0;
  for (let i = 0; i < classPoints.length; i++){
    count += classPoints[i];
  };
  let result = count / classPoints.length;
  if (yourPoints > result) {
    return true;
  } else {
    return false;
  }
};
​