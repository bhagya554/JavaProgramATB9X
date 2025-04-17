package JavaProgrammingQuestions;

public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 153;
        int originalNum = num;// 153
        int result=0;
        while(originalNum>0){
            int rem=originalNum%10;
            result=result+(int)Math.pow(rem,3);
            originalNum=originalNum/10;//15
        }
        System.out.println(result);

        if(result==num){
            System.out.println("Armstrong number");
        }

        else{
            System.out.println("Not Armstrong Number");
        }
    }
}
