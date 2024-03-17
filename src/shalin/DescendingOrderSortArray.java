package shalin;

import java.util.Arrays;

public class DescendingOrderSortArray {

    public static void main(String[] args) {

        int[] num = {15,18,22,2,3};
        int[] fun = {7,9,8,17};
        System.out.println(Arrays.toString(sortDescendingArray(num)));
        System.out.println(Arrays.toString(sortDescendingArray(fun)));

    }

    public static int[] sortDescendingArray(int[] arr) {
        int park;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    park = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = park;
                }
            }
        }
        return arr;
    }
}
