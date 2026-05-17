function howMuchILoveYou(nbPetals) {
  let newPhrase = '';
    const arr = ["", "I love you", "a little", "a lot", "passionately", "madly", "not at all"]
    while( nbPetals > 6) {
      nbPetals -= 6;
    }
    
    if ( nbPetals < arr.length) {
      for (let i = 1; i < nbPetals + 1; i++){
        newPhrase = arr[i];
      }
    } else {
      for (let i = 1; i < (nbPetals + 1) - 6; i++){
        newPhrase = arr[i];
      }
    }
  return newPhrase;
}