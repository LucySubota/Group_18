package shalin;

public class ReverseNegativeNumber {

    public static void main(String[] args) {

        System.out.println(reverseNegative(-8));
        System.out.println(reverseNegative(-10));
        System.out.println(reverseNegative(-18));
        System.out.println(reverseNegative(0));
        System.out.println(reverseNegative(7));
        System.out.println(reverseNegative(15));
        System.out.println(reverseNegative(-10));
        System.out.println(reverseNegative(-30));
        System.out.println(reverseNegative(-50));


    }

    public static int reverseNegative(int num) {

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
