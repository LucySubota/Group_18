package perizat_task_solutions;

public class ReverseNegativeNumber {
    public static void main(String[] args) {
        System.out.println(reverse_negative(-53));
    }

    public static int reverse_negative(int num){
        if (num < 0 ) {
            int rev = 0;
            while (num != 0) {
                int lastDigit = num % 10;
                rev = rev * 10 + lastDigit;
                num /= 10;
            }
            return rev;
        }
        return num;
    }
}
/*
Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53
 */