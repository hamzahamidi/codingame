function numberOfMoves ( array , arrayTarget) {
  let counter = 0;
  const desctructArray = array.join("").split("");
  const desctructArrayTarget = arrayTarget.join("").split("");
  for ( let i = 0; i < desctructArray.length ; i++ ) { 
    counter += Math.abs(desctructArray[i] - desctructArrayTarget[i]);
  }
  return counter;
}
