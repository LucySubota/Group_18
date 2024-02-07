package lucy;

public class SwapNumbers {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        a= a*b; // 50
        b=a/b; // 10
        a=a/b;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

    }
}
/*Swap two variable values without using a third variable*/