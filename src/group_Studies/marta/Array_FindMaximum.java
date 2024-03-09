package group_Studies.marta;

public class Array_FindMaximum {

    public static void main(String[] args) {

        System.out.println(findMaximum(new int[] {99, 12, 23, 32, 44, 57, 6}));
    }

    public static int findMaximum(int[] arr){

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {

            if (arr[i] > max){

                max = arr[1];
            }
        }

        return max;
    }

}
/*
Write a method that can find the maximum number from an int Array
Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99
 */