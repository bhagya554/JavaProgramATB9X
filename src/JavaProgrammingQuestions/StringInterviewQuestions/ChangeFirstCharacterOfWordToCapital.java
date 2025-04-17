package JavaProgrammingQuestions.StringInterviewQuestions;

public class ChangeFirstCharacterOfWordToCapital {
    public static void main(String[] args) {
        String str = "welcome to selenium framework";
        String[] strArr = str.split(" ");
        String resString="";
        for(String s:strArr){
            char firstCharacter = s.charAt(0);
            resString= resString+ s.replace(firstCharacter,Character.toUpperCase(firstCharacter)) + " ";
        }
        System.out.println(resString.trim());
    }
}
