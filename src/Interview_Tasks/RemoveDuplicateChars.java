package Interview_Tasks;

public class RemoveDuplicateChars {
    public static void main(String[] args) {

        String given = "aabbbccccab";
        String result = "";

        for (int i = 0; i < given.length(); i++) {
            if (!result.contains(given.charAt(i) + "")) {
                result += given.charAt(i);
            }
        }
        System.out.println(result);

/*=========================================OR=======================================

        Another solution

        String str = "AAABBBCCC";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            while (!result.contains(str.charAt(i)+"")){
                result += str.charAt(i);
            }
        }
        System.out.println(result);
*/

    }
}
