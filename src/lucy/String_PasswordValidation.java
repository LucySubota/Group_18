package lucy;

public class String_PasswordValidation {
    public static void main(String[] args) {
        System.out.println(passwordVerification("Gh&4fff ffff"));
    }
    public static boolean passwordVerification(String str) {

        if(str.length() < 6 || str.contains(" ")) return false;

        boolean upperCase = false;
        boolean lowerCase = false;
        boolean specialChar = false;
        boolean digit = false;

        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i))) digit = true;
            if(Character.isLowerCase(str.charAt(i))) lowerCase = true;
            if(Character.isUpperCase(str.charAt(i))) upperCase = true;
            if(!Character.isLetterOrDigit(str.charAt(i))) specialChar = true;
            if(upperCase && lowerCase && specialChar && digit) return true;
        }
       return false;
    }
}
/*
1. Write a return method that can verify if a password is valid or not.
requirements:
1. Password MUST be at least have 6 characters and should not contain space
2. PassWord should at least contain one upper-case letter
3. PassWord should at least contain one lowercase letter
4. Password should at least contain one special character
5. Password should at least contain a digit
if all requirements above are met, the method returns true, otherwise returns  false
 */