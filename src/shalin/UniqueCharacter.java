package shalin;

public class UniqueCharacter {

    public static void main(String[] args) {
        System.out.println(uniqueChar("QQWWeekkaaKAKAT"));

    }

    public static String uniqueChar (String str){

        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);

            if (str.indexOf(each) == str.lastIndexOf(each)){
                result += each;
            }
        }
        return result;

    }


}
