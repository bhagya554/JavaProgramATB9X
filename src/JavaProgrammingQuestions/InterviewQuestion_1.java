package JavaProgrammingQuestions;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
int[] arr1 = {1,2,2,3,3,5,6,6,8}
int[] arr2 = {1,2,2,3}
Write a java program to print numbers which are repeated atleast
twice in arr1 and present in arr2.

o/p : 2,3
 */
public class InterviewQuestion_1 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 3, 5, 6, 6, 8};
        int[] arr2 = {1, 2, 2, 3, 5, 5, 6};
        printValueAsPerCondition(arr1, arr2);
    }

    public static void printValueAsPerCondition(int[] a1, int[] a2) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int num1 : a1) {
            map.put(num1, map.getOrDefault(num1, 0) + 1);
        }
//        for(int i=0;i<a1.length;i++){
//            if(map.containsKey(a1[i])){
//                map.put(a1[i],map.get(a1[i])+1);
//            }
//            else{
//                map.put(a1[i],1);
//            }
//        }
        Set<Integer> printedValues = new HashSet<>();
        for (int num2 : a2) {
            if (map.get(num2) >= 2 && map.containsKey(num2)) {
                printedValues.add(num2);
            }
        }
        for (Integer i : printedValues) {
            System.out.print(i + " ");
        }

    }
}

