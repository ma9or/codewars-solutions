public class Calculator {
    public static Double calculate(double a, String operator, double b) {
      String str = "+-*/";
      if ((operator == "/" && b == 0) || str.contains(operator) == false){
        return null;
      } else {
        switch (operator){
            case "+": return a + b; 
            case "-": return a - b; 
            case "*": return a * b; 
            case "/": return a / b;
            default: return null;
        }
      }
        
    }
}
​