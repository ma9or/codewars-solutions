import java.util.*;  
​
public class Ghost {
​
    private List<String> color = List.of("white", "yellow", "purple", "red");
    private Random newElement = new Random();
    int thing = newElement.nextInt(color.size());
    String myColor = color.get(thing);
    public String getColor() {
        return myColor;
    }
}