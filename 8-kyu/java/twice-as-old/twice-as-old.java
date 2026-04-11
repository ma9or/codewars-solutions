public class TwiceAsOld {
​
    public static int twiceAsOld(int dadYears, int sonYears) {
      Integer result = dadYears - sonYears * 2;
        if (result <= 0){return result * -1;}
        else{
        return result;}
    }
​
}