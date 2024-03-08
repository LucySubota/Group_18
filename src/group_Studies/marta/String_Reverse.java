package group_Studies.marta;

public class String_Reverse {

    public static void main(String[] args) {

        System.out.println(reverse("ABCD"));
    }

    public static String reverse(String str){

        String reverse = "";

        for (int i = str.length() - 1; i >=0 ; i--) {

            reverse += str.charAt(i);
        }

        return reverse;
    }
}
