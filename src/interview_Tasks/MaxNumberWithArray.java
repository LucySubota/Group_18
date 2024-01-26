package interview_Tasks;

public class MaxNumberWithArray {
    public static void main(String[] args) {

        int[] numbers = {15, 569, 376,385555, -38, 2890, 679, 3, 0,5645, 4};

        int max = numbers[0]; // assuming the first number is maximum

        for (int i = 1; i < numbers.length; i++) {
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println(max);

        /*--------------------------------------- OR -----------------------------------

        Another solution with built-in method

        numbers.sort();
        System.out.println(numbers.length()-1);
        */

    }
}
