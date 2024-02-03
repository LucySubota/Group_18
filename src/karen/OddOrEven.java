package karen;

import java.util.Scanner;


    public class OddOrEven {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter Number");

            int num = input.nextInt();
            if(num %2==0) {
                System.out.println("Even Number");

            }else{
                System.out.println(" odd Number");


            }
        }
    }
    

/* Numbers Odd or even:
Write  a method which can identify given number is even or odd
Output ex:
identify(5); ->"Odd"
identify(6); ->"Even" */ 
    

