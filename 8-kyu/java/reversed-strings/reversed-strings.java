import java.util.*;
​
public class Kata {
​
  public static String solution(String str) {
    List<String> list = new ArrayList<>(List.of(str.split("")));
    Collections.reverse(list);
    return String.join("", list);
  }
​
}