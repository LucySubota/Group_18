package shalin;

public class FIndMaxFromArray {

    public static void main(String[] args) {

        int[] arr = {99, 122, 23, 32, 44, 57, 6};
        System.out.println(maxNumFromArray(arr));


    }


    public static int maxNumFromArray(int[] arr) {

        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }
}
