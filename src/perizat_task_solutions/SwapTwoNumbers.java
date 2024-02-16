package perizat_task_solutions;

public class SwapTwoNumbers {

    public static void main(String[] args) {
        int num1 = 567;
        int num2 = 614;

        num1=num2+num1;
        num2=num1-num2;
        num1=num1-num2;

        System.out.println(num1);
        System.out.println(num2);
    }
}
/*
Swap two variable values without using a third variable
 */

