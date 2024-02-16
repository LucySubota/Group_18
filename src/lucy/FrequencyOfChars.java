package lucy;

import java.util.*;

public class FrequencyOfChars {
    public static void main(String[] args) {
        System.out.println(frequencyOfChars("AAABBCDD"));
    }
    public static String frequencyOfChars(String str){

        String result = "";
        List<String> chars = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : chars) {
            if(!result.contains(each)){
                result += each + Collections.frequency(chars, each);
            }
        }
        return result;
    }
}
/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */