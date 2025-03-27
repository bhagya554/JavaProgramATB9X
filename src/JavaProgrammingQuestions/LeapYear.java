package JavaProgrammingQuestions;

import java.util.Scanner;

/*
✅ Leap Year Checker:
Create a program that determines whether a given year is a leap year.
A leap year is divisible by 4, but not by 100 unless it is also divisible by 400.

leap year - divisible by 4 and not divisible by 100
divisible by 400
 */
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter year value");
        int year = sc.nextInt();
        if (isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " not a leap year");
        }
    }

    public static boolean isLeapYear(int yearValue) {
        if ((yearValue % 4 == 0 && yearValue % 100 != 0) || (yearValue % 400 == 0)) {
            return true;
        }
        return false;
    }
}
