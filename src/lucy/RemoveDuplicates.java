package lucy;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(noDuplicates("AAABBBCCC"));
    }
    public static String noDuplicates(String str){
        String noDups = "";
        Set<String> result = new LinkedHashSet<>(Arrays.asList(str.split("")));
        for(String each : result){
            noDups += each;
        }
        return noDups;
    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */