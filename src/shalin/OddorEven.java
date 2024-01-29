package shalin;

public class OddorEven {

    public static void main(String[] args) {

        checkNumber(5);
        checkNumber(6);

    }

    public static void checkNumber(int num) {

        if (num % 2 == 0) {
            System.out.println("Entered number " + num + " is even");
        } else if (num % 2 != 0) {
            System.out.println("Entered number " + num + " is odd");
        }

    }
}
