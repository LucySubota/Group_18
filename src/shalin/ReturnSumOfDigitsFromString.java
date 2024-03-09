package shalin;

public class ReturnSumOfDigitsFromString {

    public static void main(String[] args) {

        System.out.println(sumOfNumbersFromString("I4 am7 J7ava5 develop33w1er234"));
        System.out.println(sumOfNumbersFromString("I5 a3m an Soft9ware 2 Develop3er"));
      //  sumOfNumbersFromString("I4 am7 J7ava5 develop33w1er234");
      //  sumOfNumbersFromString("I5 a3m an Soft9ware 2 Develop3er");
    }


    public static int sumOfNumbersFromString(String str) {


        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))){
              sum+=Integer.parseInt(str.charAt(i)+"");
            }
        }
        return sum;

    }

}
