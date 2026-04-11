public class Calculate {
  public static String bmi(double weight, double height) {
    Double ind = weight / (height * height);
    if (ind <= 18.5) {return "Underweight";}
    else if (ind <= 25.0) {return "Normal";}
    else if (ind <= 30.0) {return "Overweight";}
    else {return "Obese";}
  }
}