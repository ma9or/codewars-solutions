var number = function(busStops){
  let getOn = 0;
  let getOff = 0;
  
  let arr = busStops.flat(1);
  for (let i = 0; i < arr.length; i++) {
    if ( i % 2 == 0) {
      getOn += arr[i];
    } else {
      getOff += arr[i];
    }
  };
  return getOn - getOff;
}