package karen;

import java.util.Scanner;

public class DivideWithoutOperator {


        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            System.out.println("Enter First Number");
            int a  = input.nextInt();

            System.out.println("Enter Second Number");
            int b = input.nextInt();

            int count = 0;
            while (a >= b) {
                a = a - b;
                count = count + 1;
            }
            System.out.println(" Division is: "+ count);


        }
    }


/*  Numbers - Divide without / operator:
Write a method that can divide two numbers without using division operator*/


