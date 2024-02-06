package shalin;

public class ConsecutiveNumbers {


    public static void main(String[] args) {

        consecutiveNumbers(16);
        System.out.println("++++++++++++++++");
        consecutiveNumbers(17);
        System.out.println("++++++++++++++++");
        consecutiveNumbers(30);
    }

    public static void consecutiveNumbers(int n){

        for (int i = 1; i <=n; i++) {

            String result = "";

            if (i % 2 == 0){
                result+= "Codility";
            }
            if (i % 3 == 0){
                result+= "Test";
            }
            if(i % 5 == 0){
                result += "Coders";
            }

            System.out.println(result.isEmpty() ? i : result);
        }
    }
}
