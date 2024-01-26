package interview_Tasks;

public class PerfectSquare {
    public static void main(String[] args) {

        System.out.println(isPerfectSquare(49));

    }
    public static boolean isPerfectSquare(int n){
        return Math.sqrt(n) == (int) Math.sqrt(n);   //also right
    }   // returns double value, that's why (int)

/*----------------------------------------- OR ---------------------------------------

    public static boolean isPerfectSquare(int n) {

        for (int i = 2; i <= n/2; i++) {
            if(i * i == n){
                return true;
            }
        }
        return false;
    }*/
}
