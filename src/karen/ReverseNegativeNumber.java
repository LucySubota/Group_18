package karen;

public class ReverseNegativeNumber {

    public static void main(String[] args) {
        int input = -35;
        int reversed = reverseNegativeNumber(input);
        System.out.println("Reversed: " + reversed);
    }

    public static int reverseNegativeNumber(int num) {
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be a negative number.");
        }

        // Convert to positive for reversal
        int positiveNum = Math.abs(num);

        // Reverse the digits
        int reversed = 0;
        while (positiveNum != 0) {
            int digit = positiveNum % 10;
            reversed = reversed * 10 + digit;
            positiveNum /= 10;
        }

        // Restore the sign
        reversed *= -1;

        return reversed;
    }
}

    /*
     public static void main(String[] args) {
        int input = -35;
        int reversed = reverseNegativeNumber(input);
        System.out.println("Reversed: " + reversed);
    }

    public static int reverseNegativeNumber(int num) {
        // Check if the input is a negative number
        if (num >= 0) {
            throw new IllegalArgumentException("Input must be a negative number.");
        }

    //Reverse the digits
        int reversed = 0;
        int temp = num;  // Use a temporary variable to avoid modifying the original value
        while (temp != 0) {
            int digit = temp % 10;
            reversed = reversed * 10 + digit;
            temp /= 10;
        }

        return reversed;
    }
}*/
//Write a return method that can reverse digits of a negative number and return it as int
//input: -35  output: -53


