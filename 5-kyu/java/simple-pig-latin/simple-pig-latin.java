import java.util.List;
​
public class PigLatin {
     public static String pigIt(String str) {
        String newStr = "";
        String[] newLists = str.split(" ");
         List<String> punctuationMarks = List.of("!", "?", ".", ",", ";", ":", "'", "\"", "(", ")");
        
        for (String word : newLists) {
            if (punctuationMarks.contains(word)) {  // Проверяем, есть ли слово в списке
                newStr += word + " ";  // Знак препинания - оставляем
            } else {
                String newWord = word.substring(1) + word.charAt(0) + "ay";
                newStr += newWord + " ";
            }
        }
        return newStr.trim();
​
        }
}