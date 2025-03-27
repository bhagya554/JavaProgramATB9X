package oct.lab.Oct09;

public class Oct092024_SystemOutPrintf {
    public static void main(String[] args) {
        /*
    printf - replaces value in
    %d - integer
    %s - String
    %f - float/double
    %b - boolean
     */
        int age = 10;
        String name = "geetha";
        double sal = 34555.678;
        boolean isFemale = true;

        System.out.printf("Your age is %d\n", age);
        System.out.printf("Your name is %s\n", name);
        System.out.printf("Your salary is %f\n", sal);
        System.out.printf("Your gender is female:  %b\n", isFemale);

    }
}
