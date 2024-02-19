package shalin;

public class RemoveDuplicates {

    public static void main(String[] args) {

        System.out.println(removeDuplicates("AAABBBCCC"));
        System.out.println(removeDuplicates("iii kknnoowww thhhhiiisss wwwiilll wwoorrkkk"));
    }

    public static String removeDuplicates(String str){

        String result= "";
        for (int i=0;i<str.length();i++){
            if(result.contains(""+str.charAt(i))){
                continue;
            }
            result += str.charAt(i);
        }
      return result;
    }
}
