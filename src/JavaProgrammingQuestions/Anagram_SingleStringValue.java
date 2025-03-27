package JavaProgrammingQuestions;
import java.util.Arrays;
//Verify the given String is an Anagram or not
public class Anagram_SingleStringValue {
    public static void main(String[] args) {
        String str = "MaDaM De445###e";//deeeloprv
        if (isAnagram(str)) {
            System.out.println("Anagram");
        } else {
            System.out.println("Not Anagram");
        }
    }
    private static boolean isAnagram(String str) {
        //remove non-letter characters and convert to lowercase
        str = str.replaceAll("[^a-zA-Z]", "").toLowerCase();
        char[] ch1 = str.toCharArray();
        Arrays.sort(ch1);
        for (int i = 0; i < ch1.length- 1; i = i + 2) {
            if (ch1[i] != ch1[i + 1]) {
               return false;
            }
        }
       return true;
    }
}
