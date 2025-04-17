package JavaProgrammingQuestions.StringInterviewQuestions;
import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;
public class CountCharacterOccurencesInAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();
        countCharacter(str);
    }

    public static void countCharacter(String s){
        Map<Character,Integer> characterMap = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c!=' '){
            characterMap.put(c,characterMap.getOrDefault(c,0)+1);
            }
            }

        for(Character character: characterMap.keySet()){
            System.out.println("Character: " + character + " count is :" + characterMap.get(character));
        }
    }
}
