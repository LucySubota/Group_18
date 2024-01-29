package perizat_task_solutions;

public class DivideWithoutOperator {
    public static void main(String[] args) {
TwoNums(48, 7);
    }

    public static void TwoNums(int num1, int num2) {
        int count=0;
        while (num1 >= num2) {
            num1 -= num2;
            count++;
        }
        System.out.println(count+" with a remainder of "+num1);
    }
}

