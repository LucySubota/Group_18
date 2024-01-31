package lucy;

public class Division {
    public static void main(String[] args) {

        System.out.println(result(3,1));

    }
    public static String result (int n1, int n2){

       /* try {
         int  n = n1/n2;
        }catch (ArithmeticException e){
            e.printStackTrace();
            return "";
        }*/

        if(n2 == 0){
            throw new ArithmeticException("Can not divide by 0");
        }

        int result = 0;
        while(n1 >= n2){
            n1 -= n2;
            result++;
        }
        return n1 + " / " + n2 + " is " + result + " with remainder " + n1;
    }
}
