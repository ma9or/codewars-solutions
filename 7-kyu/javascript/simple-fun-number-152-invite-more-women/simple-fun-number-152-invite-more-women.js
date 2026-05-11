function inviteMoreWomen(L) {
  let men = 0;
  let women = 0;
  for (let i = 0; i < L.length; i++) {
    if (L[i] === 1) {
      men += 1;
    } else {
      women += 1;
    }
  };
  
  if (women < men) {
    return true;
  } else {
    return false;
  } 
}