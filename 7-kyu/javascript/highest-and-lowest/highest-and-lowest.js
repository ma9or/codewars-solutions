function highAndLow(numbers){
  const arr = numbers.split(" ");
  let mn = Infinity;
  let mx = -Infinity;
  for (let i = 0; i < arr.length; i++) {
    const num = Number(arr[i]);
    if (num < mn) {
      mn = num;
    } if (num > mx) {
      mx = num;
    }
  };
  return `${mx} ${mn}`
};