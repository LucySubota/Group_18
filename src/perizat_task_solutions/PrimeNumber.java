package perizat_task_solutions;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println(primeNumber(3));
        System.out.println(primeNumber(4));
        System.out.println(primeNumber(4));
        System.out.println(primeNumber(7));
        System.out.println(primeNumber(11));
        System.out.println(primeNumber(30));
        System.out.println(primeNumber(17));
        System.out.println(primeNumber(19));
        System.out.println(primeNumber(23));
        System.out.println(primeNumber(20));
        System.out.println(primeNumber(10));
    }

    public static boolean primeNumber(int num){
        if (num<2){
            return false;
        }
        for (int i = 2; i <num ; i++) {

            if(num % i == 0){
                return false;
            }

        }

        return true;
    }
}
/*
Write a method that can check if a number is prime or not
 */