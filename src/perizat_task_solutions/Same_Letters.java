package perizat_task_solutions;

public class Same_Letters {

    public static void main(String[] args) {


        System.out.println(sameLetters("perizat", "perizat1"));
    }


    public static boolean sameLetters(String str1, String str2) {
        String same = "";
        if (str1.length() != str2.length()) {
            return false;
        }

        for (int i=0; i<str2.length(); i++){
            char temp = str2.charAt(i);
            if (str1.indexOf(temp) == -1){
                return false;
            }
        }
        return true;
    }


}


/*
Write a return method that checks if a string is built out of the same letters as another string.
  Ex: same("abc", "cab"); ==> true
      same("abc", "abb"); ==> false
 */