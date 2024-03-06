package perizat_task_solutions;

public class String_Reverse {
    public static void main(String[] args) {
        System.out.println(reverse_method("Cydeo"));
        System.out.println(reverse_method("Perizat"));
        System.out.println(reverse_method("SDET"));
    }

    public static String reverse_method(String str){
        String str2="";
        for(int i=str.length()-1; i>=0; i--){
            str2 = str2+str.charAt(i);
        }
        return str2;
    }
}
/*
Write a return method that can reverse  String
Ex: Reverse("ABCD"); ==> DCBA
 */