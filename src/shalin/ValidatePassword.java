package shalin;

public class ValidatePassword {

    public static void main(String[] args) {

        System.out.println(isValidPwd("Zrt4@"));
        System.out.println(isValidPwd("Zrt @4gt6"));
        System.out.println(isValidPwd("Zrt4gt6"));
        System.out.println(isValidPwd("Zrt4@gt6"));

    }


    public static boolean isValidPwd(String password) {

        if (password.length() < 6 || password.contains(" ")) {
            return false;
        }

        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        boolean hasDigit = false;


        for (char each : password.toCharArray()) {
            if (Character.isUpperCase(each)) {
                hasUpperCase = true;
            } else if (Character.isLowerCase(each)) {
                hasLowerCase = true;
            } else if (Character.isDigit(each)) {
                hasDigit = true;
            } else {
            hasSpecialChar = true;
            }
        }
        return hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;
    }
}
