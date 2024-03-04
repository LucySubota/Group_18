package shalin;

import java.sql.Array;
import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {


        System.out.println(frequencyOfChars("AAABBCDD"));
        System.out.println(frequencyOfChars("bbcccaaaaa"));
    }

    public static String frequencyOfChars(String str){

        String result = "";
        ArrayList<String> arr = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : arr) {
            if(!result.contains(each)){
                result += each + Collections.frequency(arr, each);
            }
        }
        return result;

    }
}
