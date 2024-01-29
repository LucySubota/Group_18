package group_Studies.marta;

public class DivideWithoutDivisionOperator {

    public static void main(String[] args) {
        division(10,5);
        division(8, 0);

    }

    public static void division(int x, int y){

        if(y==0){
            System.err.println("Please use a number which is greater than zero!");
            return;
        }

        int count =0;
        String result = x + " / " + y + " = ";

        while (x>=y){
            count++;
            x-=y;
        }


        System.out.println(result + count );
    }
}
