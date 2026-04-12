public class Kata {
  public static int rentalCarCost(int d) {
    int totalPrice = d * 40;
    if (d >= 7){
      return totalPrice - 50;
    } else if (d >= 3){
      return totalPrice - 20;
    } else {
      return totalPrice;
    }
  }
}
​