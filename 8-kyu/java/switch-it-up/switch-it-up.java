import java.util.List;
​
public class Kata
{
  public static String switchItUp(int number)
  {
    List<String> new_list = List.of("Zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine");
    return new_list.get(number);
  }
}