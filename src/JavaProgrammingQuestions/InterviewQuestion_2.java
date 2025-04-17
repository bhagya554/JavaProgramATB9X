package JavaProgrammingQuestions;
import java.util.Map;
import java.util.HashMap;
import java.util.Scanner;
/*
Given a String and a character. Obtain occurence of that character

 */
public class InterviewQuestion_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String value");
        String str=sc.nextLine();
        System.out.println("Enter a char value");
        char c =sc.nextLine().charAt(0);
        getCount(str,c);
    }
    public static void getCount(String str,char c1){
        str= str.replaceAll("[^A-Za-z]","").toLowerCase();
        Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c = str.charAt(i);
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(Character.isLetterOrDigit('3'));

        System.out.println(c1 + " is present " + map.get(c1) + " times in the given string: " +str);
    }
}
