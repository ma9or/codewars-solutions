public class AgeDiff {
  public static String CalculateAge(int birth, int yearTo) {
    int date = Math.abs(yearTo - birth);
    if (date == 0) {return "You were born this very year!";}
    if (yearTo > birth) {
      if (date == 1) {
        return String.format("You are %d year old.", date);
      }
      return String.format("You are %d years old.", date);
    }
    else {
      if (date == 1) {
        return String.format("You will be born in %d year.", date);
      }
      return String.format("You will be born in %d years.", date);     
    }
  }
}