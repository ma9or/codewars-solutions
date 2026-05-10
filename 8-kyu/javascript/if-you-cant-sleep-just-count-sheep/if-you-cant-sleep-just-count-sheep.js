var countSheep = function (num){
  let newStr = '';
  for (let i = 1; i <= num; i++) {  // Начинаем с 1, а не с 0
    newStr += `${i} sheep...`;
  }
  return newStr;
}