package oct.tasks;

public class Oct092024_TableUsingPrintf {
    public static void main(String[] args) {
/*
printf - replaces value in %d/%s/%f/%b
 */
        int a = 7;
        System.out.println();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",a,i,a*i);
        }


    }
}
