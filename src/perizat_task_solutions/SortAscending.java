package perizat_task_solutions;

import java.util.Arrays;

public class SortAscending {
    public static void main(String[] args) {

       System.out.println(Arrays.toString(acsendingMethod(10, 9, 8, 7)));


    }

    public static int[] acsendingMethod(int... arr) {
        int numsOfArr = 0;
        for (int i = 0; i < arr.length; i++) {// 3 , 4
            for (int j = 0; j < arr.length-1; j++) { //4, 58
                if (arr[j] > arr[j + 1]) {
                     numsOfArr = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = numsOfArr;
                }
                System.out.println(Arrays.toString(arr));
            }

        }
        return arr;
    }
}
/*
Write a return method that can sort an int array in
Ascending order without using the sort method of the Arrays class
Ex: int[] arr = {10, 9, 8, 7};
arr = Sort(arr); ==>{ 7, 8, 9, 10};
 */