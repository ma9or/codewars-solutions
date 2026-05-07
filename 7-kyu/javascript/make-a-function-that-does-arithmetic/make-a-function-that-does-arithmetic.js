function arithmetic(a, b, operator){
  switch (operator) {
      case "add":
         return (a, b, a + b);
      case "subtract":
        return (a, b, a - b);
      case "multiply":
        return (a, b, a * b);
      case "divide":
        return (a, b, a / b); 
  }   
}