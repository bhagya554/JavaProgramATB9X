package JavaProgrammingQuestions.StringInterviewQuestions;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {
    public static void main(String[] args) {
        String str="sunday monday";
        findDuplicateCharacters(str);
    }
    public static void findDuplicateCharacters(String str){
        str = str.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        char[] charArr = str.toCharArray();
        Map<Character,Integer> m = new HashMap<>();
        for(char c:charArr){
            m.put(c,m.getOrDefault(c,0)+1);
        }
        System.out.println("Duplicate characters are: ");
        for(Character c: m.keySet()){
            if(m.get(c)>=2){
                System.out.println(c + ": " + m.get(c));
            }
        }
    }
}
