package karen;

import java.util.Scanner;

public class NumberDivisibleBy3_5_15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a value for N: ");
        int N = scanner.nextInt();

        System.out.println("Divisible By 15:");
        printDivisibleBy(N, 15);

        System.out.println("Divisible By 5:");
        printDivisibleBy(N, 5);

        System.out.println("Divisible By 3:");
        printDivisibleBy(N, 3);

        scanner.close();
    }

    private static void printDivisibleBy(int N, int divisor) {
        for (int i = 1; i <= N; i++) {
            if (i % divisor == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}


/*Numbers -- Divisible by 3, 5, 15
Write a program that can print the numbers between 1 ~ 100 that can be divisible by 3, 5, and 15.
if the number can be divisible by 3, 5 and 15, then it should only be displayed in Divisible By 15 section
if the number can be divisible by 3 but cannot be divisible by 15, then it should only be displayed in Divisible By3 section
if the number can be divisible by 5 but cannot be divisible by 15, then it should only be displayed in Divisible By5 section
example:
OutPut:
Divisible By 15 15 30 45 60 75 90
Divisible By 5 5 10 20 25 35 40 50 55 65 70 80 85 95 100
Divisible By 3 3 6 9 12 18 21 24 27 33 36 39 42 48 51 54 57 63 66 69 72 78 81 84 87 93 96 99*/


