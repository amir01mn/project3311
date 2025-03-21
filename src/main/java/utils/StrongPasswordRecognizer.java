package utils;

public class StrongPasswordRecognizer {
    public StrongPasswordRecognizer() {
    }

    public boolean isPasswordStrong(String password) {
        if(password == null) return false;
        boolean hasUpper = false, hasLower = false, hasDigit = false, hasSymbol = false;
        for(char c: password.toCharArray()){
            if(Character.isUpperCase(c)) hasUpper = true;
            else if(Character.isLowerCase(c)) hasLower = true;
            else if(Character.isDigit(c)) hasDigit = true;
            else hasSymbol = true;
        }
        return hasUpper && hasLower && hasDigit && hasSymbol;
    }
}
