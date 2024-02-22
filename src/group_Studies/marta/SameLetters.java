package group_Studies.marta;

import java.util.Arrays;

public class SameLetters {

    public static void main(String[] args) {

        System.out.println(sameLetters("abc", "cab"));
        System.out.println(sameLetters("abc", "abb"));
    }

    public static boolean sameLetters(String str1, String str2) {

        char[] a1 = str1.toCharArray();
        char[] a2 = str2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);

        String sortedStr1 = new String(a1);
        String sortedStr2 = new String(a2);

        return sortedStr1.equals(sortedStr2);

    }

}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */