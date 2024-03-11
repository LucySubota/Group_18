package lucy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Array_FindMaximum {
    public static void main(String[] args) {
        System.out.println(maxNumWithSOrt(new int[]{99, 12, 23, 32, 44, 57, 6}));
        System.out.println(maxNumWithoutSOrt(new int[]{99, 12, 23, 32, 44, 57, 6}));
        System.out.println(maxNumWithoutSOrt2(new int[]{99, 12, 23, 32, 44, 57, 6}));
    }
    public static int maxNumWithSOrt(int[] arr){
        Arrays.sort(arr);
        return arr[arr.length-1];
    }

    public static int maxNumWithoutSOrt(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int each : arr){
            list.add(each);
        }
        return Collections.max(list);
    }

    public static int maxNumWithoutSOrt2(int[] arr){
        int max = arr[0];
        for(int each : arr){
            if(each > max) max = each;
        }
        return max;
    }
}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */