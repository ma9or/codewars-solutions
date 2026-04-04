def calculate(num1, operation, num2): 
    # your code here
    if (operation == "/" and num2 == 0) or operation not in ["+" , "-", "*",  "/"]:
        return None
    match operation:
        case "+":
            return num1 + num2
        case "-":
            return num1 - num2
        case "*":
            return num1 * num2
        case "/":
            return num1 / num2
        
​
        