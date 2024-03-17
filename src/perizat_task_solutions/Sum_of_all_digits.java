package perizat_task_solutions;

public class Sum_of_all_digits {
    public static void main(String[] args) {

        System.out.println(sum_of_all_digits("12 java 5 apple 3"));

    }



    public static int sum_of_all_digits(String str){
        int nums = 0;
        String arr[] = str.split(" ");
        for(int i=0; i<arr.length;i++) {
            try {
                nums += Integer.parseInt(arr[i]);
            }catch(RuntimeException e){
e.printStackTrace();
            }
        }
        return nums;
    }




}
