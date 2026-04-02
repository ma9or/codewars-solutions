public class RemoveChars {
    public static String remove(String str) {
        String newStr = "";
        if (str.length() == 2){
          return "";
        } else {
          for (int i = 1; i < str.length() - 1; i++) {
            newStr += str.charAt(i);
          }
        }
      return newStr;
    }
}
​