import java.util.*;
​
public class ReverseWords{
​
 public static String reverseWords(String str){
//        String[] List = str.split("\\s+");
        List<String> newList = new ArrayList<>(List.of(str.split("\\s+")));
        Collections.reverse(newList);
        String str1 = String.join(" ", newList);
        return str1;
}
  }