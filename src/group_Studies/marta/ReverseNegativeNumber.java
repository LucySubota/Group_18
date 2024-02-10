package group_Studies.marta;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNegative(0));
        System.out.println(reverseNegative(-35));
        System.out.println(reverseNegative(-10));

    }

    public static int reverseNegative(int num) {

        if (num < 0 ) {
            int reverse = 0;
            while (num != 0) {
                int lastDigit = num % 10;
                reverse = reverse * 10 + lastDigit;
                num /= 10;
            }
            return reverse;
        }
        return num;

    }
}
