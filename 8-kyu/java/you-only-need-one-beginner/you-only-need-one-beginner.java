import java.util.Arrays;
​
public class Solution {
​
// For the Java version you must use equivalence semantics (.equals()),
// not reference semantics (==)
    public static boolean check(Object[] a, Object x) {
      return Arrays.asList(a).contains(x);
  }
}