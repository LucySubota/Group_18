package lucy;

public class StringReverse {
    public static void main(String[] args) {
        System.out.println(reverse("whatever"));
        System.out.println(reverseWithoutXtraString("whatever"));
    }
    public static String reverse(String str){
        String result = "";
        for(int i = str.length()-1; i >= 0; i--){
            result += str.charAt(i)+"";
        }
        return result;
    }

    public static String reverseWithoutXtraString(String str){
        char[] arr = str.toCharArray();
        str = arr[arr.length-1] + "";
        for(int i = arr.length-2; i >= 0; i--){
            str += arr[i];
        }
        return str;
    }
}
