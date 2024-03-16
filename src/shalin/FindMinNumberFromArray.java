package shalin;

public class FindMinNumberFromArray {

    public static void main(String[] args) {
        int[] num = {99, 12, 23, 32, 44, 57, 6};
        int[] arr = {3, 5, 1, -5, -1, 5};
        System.out.println(minNum(num));
        System.out.println(minNum(arr));
    }
    public static int minNum(int[] arr){
        int min = arr[0];
        for(int each : arr){
            if(each < min){
                min = each;
            }
        }
        return min;
    }

}
