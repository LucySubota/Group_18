package perizat_task_solutions;

import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class FindMinimum {

    public static void main(String[] args) {
        System.out.println(minNum(99, 12, 23, 32, 44, 57, 6));
        System.out.println(minNum(7, 5, 90, 345, 8, -2));
        System.out.println(minNum(45, 89, -4, 0, -34, 92));
    }

    public static int minNum(int... arr){
        int min = Integer.MAX_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]<min){
                min=arr[i];
            }
        }
        return min;
    }
}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */