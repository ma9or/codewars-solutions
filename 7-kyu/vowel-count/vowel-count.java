public class Vowels {
​
   public static int getCount(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
​
            if (c == 'a' || c == 'i' || c == 'o' || c == 'u' || c == 'e') {
                count++;
            }
        }
        return count;
​
}
  }
​
​