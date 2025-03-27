package oct.tasks.Oct09;

public class Oct092024_TableUsingPrintf {
    public static void main(String[] args) {
  /*
    printf - replaces value in
    %d - integer
    %s - String
    %f - float/double
    %b - boolean
   */
        int value = 7;
        System.out.println();
        for(int i=1;i<=10;i++){
            System.out.printf("%d X %d = %d\n",value,i,value*i);
        }


    }
}
