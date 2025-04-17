package JavaProgrammingQuestions.StringInterviewQuestions;
import java.util.Arrays;
public class Anagram_SingleString {
    public static void main(String[] args) {
        String str = "hello123 hello123 #%%# 4747";
        if (isAnagram(str)) {
            System.out.println(str + " is an anagram");
        } else {
            System.out.println(str + " not an anagram");
        }
    }

    public static boolean isAnagram(String str) {
        str=str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        for (int i = 0; i < charArray.length - 1; i = i + 2) {
            if (charArray[i] != charArray[i + 1]) {
                return false;
            }
        }
        return true;
    }
}
