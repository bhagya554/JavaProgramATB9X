package JavaProgrammingQuestions;

public class Palindrome_Number {
    public static void main(String[] args) {
        int i=6585;
        if(isPalindrome(i)){
            System.out.println(i + " is a palindrome");
        }
        else{
            System.out.println(i + " is not a palindrome");
        }
    }

    public static boolean isPalindrome(int a){
        int rev = 0;
        int temp=a;//1234321
        while(temp>0){
            rev = rev*10+temp%10;//10+2=1234321
            temp=temp/10;//0
        }
        if(rev==a){
            return true;
        }
return false;
    }
}
