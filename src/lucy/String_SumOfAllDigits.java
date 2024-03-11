package lucy;

public class String_SumOfAllDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits("12 java 500 apple 3"));
        System.out.println(sumOfDigits2("12 java 500 apple 3"));
    }
    public static int sumOfDigits(String str){
        int sum = 0;
        String[] arr = str.split(" ");
        for(String each : arr){
           try {
               sum += Integer.parseInt(each + "");
           }catch (NumberFormatException e){

           }
        }
        return sum;
    }

    public static int sumOfDigits2(String str){
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            String hold = "";
            while(i < str.length() && Character.isDigit(str.charAt(i))){
                hold += str.charAt(i);
                i++;
            }
            if(!hold.isEmpty()) {
                sum += Integer.parseInt(hold);
            }
        }
     return sum;
    }
}
/*
Write a method that can return the sum of the digits in a string
Ex:  "12 java 5 apple 3"  ==>  20
 */

/*
if(Character.isDigit(each.charAt(0))){


            }
 */