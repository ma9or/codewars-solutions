def bmi(weight, height):
    
    ind = weight / (height ** 2)
    match ind:
        case _ if ind <= 18.5 : return "Underweight"
        case _ if ind <= 25.0 : return "Normal"
        case _ if ind <= 30.0 : return "Overweight"
        case _ if ind > 30 : return "Obese"
    