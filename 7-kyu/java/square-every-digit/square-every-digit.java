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
/*
        charInts[i] - '0' выражение работает с таблицей ascii( '0' = 48) используя это
        наш символ переводиться в число и вычетаем 48
 */
//            result += (charInts[i] - '0') * (charInts[i] - '0');
            /*
            также можно использовать метод Character.digit(charInts[i], 10) он преобразует символ в число
            в указанной системе исчислениея  radix
             */
            result += Character.digit(charInts[i], 10) * Character.digit(charInts[i], 10);
        }
        /*
        метод  parseInt преобразует строку в число
         */
        return Integer.parseInt(result);
}
  }