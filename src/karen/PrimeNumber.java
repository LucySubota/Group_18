package karen;

public class PrimeNumber {
    public static void main(String[] args) {


            int number = 13; // Replace this with the number you want to check
            if (isPrime(number)) {
                System.out.println(number + " is a prime number.");
            } else {
                System.out.println(number + " is not a prime number.");
            }
        }

        public static boolean isPrime(int num) {
            if (num <= 1) {
                return false;
            }
            for (int i = 2; i <= num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }


    //Write a method that can check if a number is prime or not


