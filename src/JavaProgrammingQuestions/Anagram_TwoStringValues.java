package JavaProgrammingQuestions;
import java.util.Arrays;
//Verify if the given 2 Strings are Anagram of each other
public class Anagram_TwoStringValues {
    public static void main(String[] args) {
        String s1 = "silent";
        String s2 = "listen";
        if(isAnagram(s1,s2)){
            System.out.println("Anagram");
        }
        else{
            System.out.println("Not Anagram");
        }
    }

    private static boolean isAnagram(String str1,String str2){
        if(str1.length()!=str2.length()){
            return false;
        }
        //remove non-character values
        str1 = str1.replaceAll("[^a-zA-Z]","").toLowerCase();
        str2 = str2.replaceAll("[^a-zA-Z]","").toLowerCase();

        //Convert to character array
        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();

        //Sort characters in the above character array
        Arrays.sort(ch1);//silent - {'e','i','l','n','s','t'}
        Arrays.sort(ch2);//listen - {'e','i','l','n','s','t'}

        for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                return false;
            }
        }
   return true;
    }
}
