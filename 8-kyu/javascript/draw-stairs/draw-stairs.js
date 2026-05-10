function drawStairs(n) {
  let newStr = "";
  const ctrl = " ";
  
  for (let i = 0; i < n; i++) {
    newStr += ctrl.repeat(i) + "I";
    if (i !== n - 1) {  // Добавляем \n только если это не последняя итерация
      newStr += "\n";
    }
  }
  return newStr;
}
​