public class XO {
  
 public static boolean getXO (String str) {
        int count = 0;
        int count1 = 0;
        char[] newString = str.toCharArray();
        for (char ch : newString) {
            if (ch == 'x' || ch == 'X') {
                count++;
            }
            if (ch == 'O' || ch == 'o') {
                count1++;
            }
        }
        return count == count1;
    }
}