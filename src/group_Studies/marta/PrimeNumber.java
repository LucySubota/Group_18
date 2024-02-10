package group_Studies.marta;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println(primeNumber(1));
    }
    public static boolean primeNumber(int n){

        if (n < 2){
            return false;
        }

        for (int i = 2; i < n; i++) {
            if(n % i == 0){
                return false;
            }
        }
        return true;
    }
}
