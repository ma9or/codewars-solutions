function findSmallestInt(arr) {
  let mn = 10000000000000;
  for (let i = 0; i < arr.length; i++) {
    if (arr[i] < mn) {
      mn = arr[i];
    }
  }
  return mn;
}