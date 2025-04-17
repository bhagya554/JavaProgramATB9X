package JavaProgrammingQuestions.StringInterviewQuestions;
import java.util.Map;
import java.util.HashMap;

public class CountWordsInAString {
    public static void main(String[] args) {
        String str= "I am learning selenium I am learning with java ";
        String[] strArr=str.split(" ");
        Map<String,Integer> wordMap = new HashMap<>();
        for(String s: strArr){
            wordMap.put(s,wordMap.getOrDefault(s,0)+1);
        }

        for(String word:wordMap.keySet()){
            System.out.println("The count of word " + word + " is: " + wordMap.get(word));
        }
    }
}
