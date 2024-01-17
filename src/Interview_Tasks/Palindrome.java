package Interview_Tasks;

public class Palindrome {
    public static void main(String[] args) {

        String given = "abba";
        String reverse = "";

        for(int i = given.length()-1; i >= 0; i--){
            reverse += given.charAt(i);
        }

        if(given.equals(reverse)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }

        /*-------------------------------------------OR-------------------------------------------

        Another solution

        public static boolean isPalindrome (String given){
            int z = given.length() - 1;
            for(int i = 0; i < given.length()/2; i++){

                if(given.charAt(i) != given.charAt(z)){
                    // comparing each char from the beginning to each char from the end,
                    // cut the number of iterations in half, more officiant
                    return false;
                }
                z--;
            }
            return true;
        }

        */
    }
}
