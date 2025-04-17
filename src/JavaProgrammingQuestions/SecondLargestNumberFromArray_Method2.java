package JavaProgrammingQuestions;

import java.util.Arrays;

public class SecondLargestNumberFromArray_Method2 {
    public static void main(String[] args) {
        int[] arr = {12,400,110,900,34,2};
        int largest = arr[0];
        int secondLargest=arr[1];

        if(secondLargest>largest){
            int temp=largest;
            largest=secondLargest;//400
            secondLargest=temp;//12
        }

        for(int i=2;i<arr.length;i++){
            if(arr[i]>largest){//900>400
               secondLargest=largest;//400
               largest=arr[i];//900
            } else if (arr[i]>secondLargest && arr[i]!=largest) {
                secondLargest=arr[i];//110
            }

        }
        System.out.println(secondLargest);
    }
}
