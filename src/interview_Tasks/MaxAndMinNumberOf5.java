package interview_Tasks;

import java.util.Scanner;

public class MaxAndMinNumberOf5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int max = -2147483648; // minimum allowed number for integer
        int min = 2147483647;

        for(int i = 0; i < 5; i++) {
            System.out.println("Enter a number:");
            int num = input.nextInt();

            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
        }
            System.out.println("max = " + max);
            System.out.println("min = " + min);
    }
}
