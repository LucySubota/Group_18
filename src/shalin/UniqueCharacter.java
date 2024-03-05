package shalin;

public class UniqueCharacter {

    public static void main(String[] args) {
        System.out.println(uniqueChar("QQWWeekkaaKAKA"));

    }

    public static String uniqueChar (String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {

            if (!result.contains("" + str.charAt(i))) {

                for (int j = 0; j < str.length(); j++) {
                    if (str.charAt(i) == str.charAt(j)) {

                    }
                }
                result += ""  + str.charAt(i) ;
            }
        }
        return result;

    }


}
