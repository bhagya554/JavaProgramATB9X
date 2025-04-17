package JavaProgrammingQuestions.starPatterQuestions;
/*
           *
         * * *
       * * * * *
     * * * * * * *
   * * * * * * * * *
     * * * * * * *
       * * * * *
         * * *
           *
1.Decreasing spaces
2.Increasing stars
3.Increasing stars
*
1.Increasing spaces
2.Decreasing stars
3.Decreasing stars

 */

public class StarPattern_DiamondPattern {
    public static void main(String[] args) {
        int n=5;
        for(int i=1;i<n;i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            for (int j = 1; j < i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){
                    System.out.print("  ");
                }
                for(int j=i;j<=n;j++){
                    System.out.print("* ");
                }
                for(int j=i;j<n;j++){
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}
