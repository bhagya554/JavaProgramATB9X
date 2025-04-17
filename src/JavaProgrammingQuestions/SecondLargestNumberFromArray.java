package JavaProgrammingQuestions;

import java.util.Arrays;

public class SecondLargestNumberFromArray {
    public static void main(String[] args) {
        int[] arr = {12,40,11,90,34,2};
        Arrays.sort(arr);
        System.out.println(arr[arr.length-2]);
    }
}
