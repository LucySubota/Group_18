package lucy;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(17));
    }
    public static boolean isPrimeNumber(int n){
        for (int i = 2; i < n; i++) {
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
}
/*Write a method that can check if a number is prime or not*/