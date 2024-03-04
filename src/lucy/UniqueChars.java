package lucy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class UniqueChars {
    public static void main(String[] args) {
        System.out.println(uniqueChars("AAAABBBBCCCCDEFAAAANNNTOOOPPPBBB"));
        System.out.println(uniqueChars2("AAAABBBBCCCCDEFAAAANNNTOOOPPPBBB"));
    }
    public static String uniqueChars(String str){
        String result = "";
        String ignore = "";

        for (int i = 0; i < str.length(); i++) {
            if(ignore.contains(str.charAt(i)+"")) continue;
            if(result.contains(str.charAt(i)+"")){
                result = result.replaceAll(str.charAt(i)+"", "");
                ignore += str.charAt(i)+"";
            }else{
                result += str.charAt(i)+"";
            }
        }
        return result;
    }

    public static String uniqueChars2(String str){
        String result = "";
        ArrayList<String> allChars = new ArrayList<>(Arrays.asList(str.split("")));
        for (String each : allChars){
            if(Collections.frequency(allChars, each) == 1){
                result += each;
            }
        }
        return result;
    }
}
