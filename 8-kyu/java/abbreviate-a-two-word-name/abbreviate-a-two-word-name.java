public class AbbreviateTwoWords {
​
 public static String abbrevName(String name) {
//        String abbrevName = "";
        String[] abbrev = name.split(" ");
//        for(String ch : abbrev) {
//            abbrevName += Character.toUpperCase(charAt(0)) + ".";
//        }
​
         return Character.toUpperCase(abbrev[0].charAt(0)) + "." + Character.toUpperCase(abbrev[1].charAt(0));
​
        }
    
      
      
  }
​