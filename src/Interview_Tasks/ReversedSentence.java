package Interview_Tasks;

public class ReversedSentence {
    public static void main(String[] args) {

        String s1 = "Today is a great day";

        String[] s2 = s1.split(" ");

        String s2reversed = "";

        for (int i = s2.length-1; i >= 0; i--) {
            s2reversed += s2[i] + " ";
        }
        System.out.println(s2reversed); // day great a is Today

    }
}
