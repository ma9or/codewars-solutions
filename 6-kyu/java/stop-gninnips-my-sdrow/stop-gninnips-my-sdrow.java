import java.util.*;
​
public class SpinWords {
​
  public String spinWords(String sentence) {
    String newOld = "";
        List<String> news = new ArrayList<>(List.of(sentence.split(" ")));
        for(String new1 : news) {
            if (new1.length() >= 5) {
                String reverse = new StringBuilder(new1).reverse().toString();
                newOld = newOld + reverse + " ";
            } else {
                newOld = newOld + new1 + " ";
            }
​
        }
    return newOld.trim();
  }
}