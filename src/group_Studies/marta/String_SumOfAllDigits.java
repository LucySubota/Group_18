package group_Studies.marta;

public class String_SumOfAllDigits {

    public static void main(String[] args) {

        String input = "12 java 5 apple 3";
        System.out.println("Sum: " + sumOfAllDigits(input));
    }

    public static int sumOfAllDigits(String str){

        int sum = 0;
        int number = 0;

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (Character.isDigit(ch)){
                number = number * 10 + (ch - '0');
            }else {
                sum += number;
                number = 0;
            }

        }

        sum += number;
        return sum;

    }
}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */