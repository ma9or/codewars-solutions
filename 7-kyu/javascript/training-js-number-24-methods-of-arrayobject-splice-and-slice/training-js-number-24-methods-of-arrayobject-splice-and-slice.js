function threeInOne(arr){
  let copy = arr.slice();
  let result = [];
  while (copy.length != 0) {
    let newArr = copy.splice(0,3);
    let x = newArr.reduce((ar, cur) => ar + cur, 0);
    result.push(x);
  }
  return result;
}