package lucy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class FindMinimum {
    public static void main(String[] args) {
        System.out.println(minNumber(new int[]{99, 12, 23, 32, 44, 57, 6}));
        System.out.println(minNumber2(new int[]{99, 12, 23, 32, 44, 57, 6}));
        System.out.println(minNumber3(new int[]{99, 12, 23, 32, 44, 57, 6}));
    }
    public static int minNumber(int[] arr){
        int min = arr[0];
        for(int each : arr){
            if(each < min) min = each;
        }
        return min;
    }

    public static int minNumber2(int[] arr){
        Arrays.sort(arr);
        return arr[0];
    }

    public static int minNumber3(int[] arr){
        List<Integer> list = new ArrayList<>();
        for(int each : arr){
            list.add(each);
        }
        return Collections.min(list);
    }

}
/*
Write a method that can find the minimum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 6
 */