package perizat_task_solutions;

public class ConsecutiveNumbers {

    public static void main(String[] args) {

        String divBy2 = "Codility";
        String divBy3 = "Test";
        String divBy5 = "Coders";

        for (int i=1; i<=100; i++){

            if (i %2 ==0 && i%3 ==0 && i%5 ==0 ) { //i%2 ==0
                System.out.println(divBy2 + divBy3 + divBy5);
            }else if(i %2 ==0 && i%3 ==0) {
                System.out.println(divBy2 + divBy3);
            }else if(i%3 ==0 && i%5 ==0) {
                System.out.println(divBy3 + divBy5);
            }else if(i %2 ==0 && i%5 ==0){
                System.out.println(divBy2 +  divBy5);
            }else if (i%3 ==0){
                System.out.println(divBy3);
            }else if (i%5 == 0 ){
                System.out.println(divBy5);
            }else if (i%2 ==0){
                System.out.println(divBy2);
            }else{
                System.out.println(i+" ");
            }

        }

    }
}
/*
Numbers -- print consecutive numbers
Write a function that, given a positive integer N, prints the consecutive numbers from
1 to N, each on a separate line. However, any number divisible by 2, 3 or 5 should be
replaced by the word Codility, Test or Coders respectively. If a number is divisible
 by more than one of the numbers: 2,3 or 5, it should be replaced by a concatenation
 of the respective words Codility, Test and Coders in this given order. For example,
 numbers divisible by both 2 and 3 should be replaced by CodilityTest and numbers divisible
 by all three numbers: 2,3 and 5, should be replaced by CodilityTestCoders.
 */