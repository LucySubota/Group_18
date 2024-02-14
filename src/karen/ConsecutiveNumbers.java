package karen;

public class ConsecutiveNumbers {

        public static void printConsecutiveNumbers(int n) {
            for (int i = 1; i <= n; i++) {
                String result = "";

                if (i % 2 == 0) {
                    result += "Codility";
                }
                if (i % 3 == 0) {
                    result += "Test";
                }
                if (i % 5 == 0) {
                    result += "Coders";
                }

                if (!result.isEmpty()) {
                    System.out.println(result);
                } else {
                    System.out.println(i);
                }
            }
        }

        public static void main(String[] args) {
            // Example usage:
            int n = 15; // You can replace this with any positive integer
            printConsecutiveNumbers(n);
        }
    }


/*Numbers -- print consecutive numbers
Write a function that, given a positive integer N, prints the consecutive numbers from 1 to N, each on a separate line.
However, any number divisible by 2, 3 or 5 should be replaced by the word Codility, Test or Coders respectively.
If a number is divisible by more than one of the numbers: 2,3 or 5,
it should be replaced by a concatenation of the respective words Codility, Test and Coders in this given order.
For example, numbers divisible by both 2 and 3 should be replaced by CodilityTest
and numbers divisible by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders*/





