function perfectRoots(n) {
  let result = n ** (1/8);
  if (Number.isInteger(result)) {
    return true;
  }
  return false;
}