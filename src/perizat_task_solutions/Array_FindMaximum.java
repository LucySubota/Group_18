package perizat_task_solutions;

public class Array_FindMaximum {
    public static void main(String[] args) {


        System.out.println(find_max_arr(99, 12, 23, 236, 320, 44, 57, 6));
        System.out.println(find_max_arr(9, 127, 3, 23, 0, 4, 575, 66));
        System.out.println(find_max_arr(99, 120, 23, 99, 30, 44, 57, 6));
    }

    public static int find_max_arr(int... arr){
        int max = Integer.MIN_VALUE;
        for (int i=0; i<arr.length; i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

}
//    Write a method that can find the maximum number from an int Array
//        Ex:  int[] arr = {99, 12, 23, 32, 44, 57, 6} ==> 99