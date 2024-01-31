package lucy;

public class Division {
    public static void main(String[] args) {

        System.out.println(result(3,5));

    }
    public static String result (int n1, int n2){

        if(n2 == 0){
            return "Cannot divide by 0";
        }

        int n = n1;
        int result = 0;
        while(n >= n2){
            n -= n2;
            result++;
        }
        return n1 + " / " + n2 + " is " + result + " with remainder " + n;
    }
}
