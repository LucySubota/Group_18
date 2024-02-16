package lucy;

import java.util.Arrays;

public class SameLetters {
    public static void main(String[] args) {
        System.out.println(check("abc", "cab"));
    }
    public static boolean check(String a, String b){
        char[] aArr = a.toCharArray();
        Arrays.sort(aArr);
        char[] bArr = b.toCharArray();
        Arrays.sort(bArr);
        return Arrays.equals(aArr, bArr);
    }
}
/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */