package Group_Studies;

import java.util.Arrays;

public class NextPermutation {
    public static void main(String[] args) {
        String given = "abdc";
        System.out.println(result(given));
    }

    /*

    1. the most right char, compare index[i] with index[i+1] -      i < i+1                                           j
    2. find element to the right of i that is smaller than all the rest right elements BUT bigger than i      (i > element < rest of elements)
    3. swap i and j
    4. reverse all chars to the right of i

     */



    public static String result (String given){

        String result = "";

        char[] arr = given.toCharArray();

        for (int i = arr.length - 2; i >= 0; i--) {
            if(arr[i] < arr[i+1]){
                arr = swap(arr, i);
                arr = reverse(arr, i+1);
                break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            result += arr[i];
        }
        return result;
    }

    public static char[] swap(char[] arr, int firstIndex){

        int secondIndex = firstIndex+1;

        if(secondIndex != arr.length-1){
            for (int i = firstIndex + 1; i <= arr.length - 1; i++) {
                if (arr[firstIndex] < arr[i] && arr[i] < arr[secondIndex]) {
                    secondIndex = i;
                }
            }
        }

        char holder = arr[firstIndex];
        arr[firstIndex] = arr[secondIndex];
        arr[secondIndex] = holder;
        return arr;
    }

    public static char[] reverse (char[] arr, int index){

        char[] arrReversed = Arrays.copyOf(arr, arr.length);

        for (int j = index, i = arr.length-1; j < arr.length; j++, i--) {
            arrReversed[j] = arr[i];
        }

        return arrReversed;
    }
}
