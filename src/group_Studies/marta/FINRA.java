package group_Studies.marta;

import java.util.Scanner;

public class FINRA {

    public static void main(String[] args) {
        finra();
    }
    public static void finra (){

        for (int number = 1; number <= 30; number++) {

            if (number%3==0 && number%5==0){
                System.out.println("FINRA");
            } else if (number%5==0) {
                System.out.println("RA");
            } else if (number%3==0 ) {
                System.out.println("FIN");
            }else {
                System.out.println(number);
            }

        }

    }

}
