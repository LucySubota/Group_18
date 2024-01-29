package shalin;

public class Finra {


    public static void main(String[] args) {

       //int[] A = new int[1,2,3,4,5,6,7,8];

finra();
    }

    public static void finra (){

        for (int number = 1; number <= 30; number++) {

            if (number%3==0 && number%5==0){
                System.out.println(number + " : FINRA");
            } else if (number%5==0) {
                System.out.println(number + " : RA");
            } else if (number%3==0 ) {
                System.out.println(number + " : FIN");
            }else {
                System.out.println(number);
            }

        }


    }
}
