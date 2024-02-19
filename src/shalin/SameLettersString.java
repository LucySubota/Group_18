package shalin;

import java.util.Arrays;

public class SameLettersString {

    public static void main(String[] args) {

        System.out.println(isSameLetter("abc","cab"));
        System.out.println(isSameLetter("abc","bab"));

    }

    public static boolean isSameLetter(String first, String second){

        char[] firstArr = first.toCharArray();
        Arrays.sort(firstArr);
        char[] secondArr = second.toCharArray();
        Arrays.sort(secondArr);

        return Arrays.equals(firstArr,secondArr);
    }
}
