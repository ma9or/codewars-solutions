public class SquareDigit {
​
  public static int squareDigits(int n) {
/*        Integer.valueOf(n) - преобразует int n -> Integer n
          .toString() преобразует число (n) в строку
          .toCharArray() преобразует строку в массив символов
 */
        char[] charInts = Integer.valueOf(n).toString().toCharArray();
​
        String result = "";
        for (int i = 0; i < charInts.length; i++){
            result += (charInts[i] - '0') * (charInts[i] - '0');
        }
​
        return Integer.parseInt(result); // TODO Implement me
    }
}