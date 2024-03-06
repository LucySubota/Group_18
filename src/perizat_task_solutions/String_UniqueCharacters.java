package perizat_task_solutions;

public class String_UniqueCharacters {
    public static void main(String[] args) {
        System.out.println(unique("AAABBBCCCDEF"));

    }

    public static String unique(String str){
        String uni = "";
        for (int i=0; i<str.length(); i++){
            char temp = str.charAt(i);
            if (uni.indexOf(temp) == -1){
                uni+=temp;
            }
        }
        return uni;
    }
}
/*
Write a return  method that can find the unique characters from the String
Ex:  unique("AAABBBCCCDEF")  ==>  "DEF";
 */