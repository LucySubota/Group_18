package lucy;

import java.util.*;

public class SortDescending {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(sorted(new int[]{1, 10,20, 90, 7, 8, 90})));
        System.out.println(Arrays.toString(sorted2(new int[]{1, 10,20, 90, 7, 8, 90})));
    }
    public static int[] sorted(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[j]>arr[i]){
                    int holder = arr[i];
                    arr[i] = arr[j];
                    arr[j] = holder;
                }
            }
        }
        return arr;
    }

    public static int[] sorted2(int[] arr){
        List<Integer> list =new ArrayList<>();
        for(int each : arr){
            list.add(each);
        }
        int indexTrack= 0;
        arr = new int[list.size()];
        for (int i = 0; i < arr.length-1; i++) {
            int biggest = Collections.max(list);
            int howMany = Collections.frequency(list, biggest);
            for (int j = 0; j < howMany; j++) {
                arr[indexTrack] = biggest;
                indexTrack++;
            }
            list.removeIf(p-> Collections.max(list).equals(p));
        }

        return arr;
    }

}
/*
Write a return method that can sort an int array in descending order without using the sort method of the Arrays class
Ex: int[] arr = {10,20,7, 8, 90};
arr = Sort(arr); ==> {90, 20, 10, 8, 7};
 */