function findAverage(array) {
  let result = array.reduce((acc, curent) => acc + curent, 0);
  if (array.length == 0) {
    return 0;
  } else {
    return result / array.length;
  } 
}