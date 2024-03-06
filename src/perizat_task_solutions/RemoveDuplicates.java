package perizat_task_solutions;

public class RemoveDuplicates {
    public static void main(String[] args) {
        System.out.println(remove_duplicates("AAABBBCCCDDD"));
    }

    public static String remove_duplicates(String str){
       String str2="";
        for (int i=0; i<str.length(); i++){
           char temp = str.charAt(i);
           if (str2.indexOf(temp)== -1){
               str2+=temp;
           }
       }
       return str2;
    }
}
/*
Write a return method that can remove the duplicated values from the String
  Ex: removeDup("AAABBBCCC") ==> ABC
 */