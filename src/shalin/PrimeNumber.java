package shalin;

public class PrimeNumber {

    public static void main(String[] args) {


        System.out.println(isPrime(6));
        System.out.println(isPrime(8));
        System.out.println(isPrime(7));
        System.out.println(isPrime(9));

        System.out.println(isPrime(11));
        System.out.println(isPrime(13));

        System.out.println(isPrime(1));


    }

    public static boolean isPrime (int n){

        if (n<2){
            return false;
        }
        for (int i = 2; i <n ; i++) {

            if(n % i == 0){
                return false;
            }

        }
        return true;
    }
}
