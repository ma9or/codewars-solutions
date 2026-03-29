import java.util.ArrayList;
import java.util.List;
​
public class Kata {
  public static String highAndLow(String numbers) {
        String[] items = numbers.split(" ");
        List<Integer> newList = new ArrayList<>();
​
​
        for (String item : items) {
            newList.add(Integer.parseInt(item));
        }
​
//        int min = newList.get(0);
//        int max = newList.get(0);
​
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
​
​
        for (Integer vl : newList) {
            if (vl > max) {
                max = vl;
            }
            if (vl < min) {
                min = vl;
            }
        }
        return max + " " + min;
    }
}