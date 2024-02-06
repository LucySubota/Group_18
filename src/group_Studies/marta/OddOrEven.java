package group_Studies.marta;

public class OddOrEven {

    public static void main(String[] args) {

        Numbers(5); //Odd
        Numbers(6); //Even

    }
    public static void Numbers(int number){

        if (number % 2 == 0) {
            System.out.println("Number is even: " + number);
        } else if (number % 2 != 0) {
            System.out.println("Number is odd: " + number);
        }
    }

}
