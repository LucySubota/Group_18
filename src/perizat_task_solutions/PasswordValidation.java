package perizat_task_solutions;

import javax.security.auth.callback.CallbackHandler;

public class PasswordValidation {
    public static void main(String[] args) {

        System.out.println(valid_password("99Ki!f"));
    }

    public static boolean valid_password(String str) {
        int digit = 0;
        int lowerCase = 0;
        int upCase = 0;
        int special = 0;

        if (!(str.length() < 6 || str.contains(" "))) {


            for (int i = 0; i < str.length(); i++) {
                if (Character.isUpperCase(str.charAt(i))) {
                    upCase++;
                }
                if (Character.isLowerCase(str.charAt(i))) {
                    lowerCase++;
                }
                if ((!Character.isLetterOrDigit(str.charAt(i)))) {
                    special++;
                }
                if (Character.isDigit(str.charAt(i))) {
                    digit++;
                }
            }
            if (upCase >= 1 && lowerCase >= 1 && special >= 1 && digit >= 1) {
                return true;
            }
        }


        return false;
    }

}
//1. Write a return method that can verify if a password is valid or not.
//        requirements:
//        1. Password MUST be at least have 6 characters and should not contain space
//        2. PassWord should at least contain one upper-case letter
//        3. PassWord should at least contain one lowercase letter
//        4. Password should at least contain one special character
//        5. Password should at least contain a digit
//        if all requirements above are met, the method returns true, otherwise returns  false

