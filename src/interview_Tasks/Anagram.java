package interview_Tasks;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        System.out.println(result("mama", "amma"));

    }

    public static boolean result (String given, String result){

        char[] arr1 = given.toCharArray();
        char[] arr2 = result.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }
}
