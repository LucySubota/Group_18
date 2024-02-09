package lucy;

public class ReverseNegativeNum {
    public static void main(String[] args) {
        System.out.println(reversed(-346576));
    }
    public static int reversed(int n){
        n = Math.abs(n);
        String result = "-";
        while(n > 0){
            result += (n%10)+"";
            n /= 10;
        }
        return Integer.parseInt(result);
    }
}
/*Write a return method that can reverse digits of a negative number and return it as int
input: -35  output: -53*/