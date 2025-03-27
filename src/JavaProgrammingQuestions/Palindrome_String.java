package JavaProgrammingQuestions;

public class Palindrome_String {
    public static void main(String[] args) {
        String str = "murthy yhtrum";
        if(isPalindrome(str)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }
    }

    public static boolean isPalindrome(String s1){
        s1 = s1.toLowerCase();
        String rev = "";
        for(int i=s1.length()-1;i>=0;i--){
            rev = rev+s1.charAt(i);
        }
        if(s1.equalsIgnoreCase(rev)){
            return true;
        }
        return false;
    }
}
