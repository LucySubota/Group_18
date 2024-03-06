package perizat_task_solutions;

public class Frequency_of_characters_String {
    public static void main(String[] args) {
        System.out.println(frequencyOfCharacters("AAABBCDD"));
    }



    public static String frequencyOfCharacters(String str) {

        String result = "";

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j);
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == ch){
                    count++;
                }
            }
            if (result.contains(""+ch)){
                continue;
            }

            result += ch + "" + count;

        }

        return result;

    }

}

/*
Write a return method that can find the frequency of characters
  Ex: FrequencyOfChars("AAABBCDD") ==> A3B2C1D2
 */