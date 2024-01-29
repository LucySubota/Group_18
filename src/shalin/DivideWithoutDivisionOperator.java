package shalin;

public class DivideWithoutDivisionOperator {


    public static void main(String[] args) {
        division(6,2);
        division(7,2);
        division(13,9);
    }

    public static void division(int x, int y){

        if(y==0){
            System.out.println("We can't divide by zero. Please use a number which is greater than zero");
            return;
        }

        int count =0;
        String result = x + " / " + y + " is ";

        while (x>=y){
            count++;
            x-=y;
        }
        System.out.println(result + count + " with remainder " + x);
    }
}
