package shalin;

public class ReverseString {

   public static void main(String[] args) {

       System.out.println(reverseString("sdet"));
       System.out.println(reverseString("akka"));

    }


    public static String reverseString(String str){

        String reverse = "";

        for(int i = str.length()-1; i >= 0; i--){
            reverse += str.charAt(i);
        }
        return reverse;

    }
}
