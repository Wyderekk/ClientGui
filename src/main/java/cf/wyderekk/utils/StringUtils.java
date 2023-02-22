package cf.wyderekk.utils;

public class StringUtils {
    
    public static boolean containsNumber(String text) {
        String t = text;
        boolean found = false;
        char[] chars = t.toCharArray();
        for(char c : chars){
            if(Character.isDigit(c)){
                found = true;
            }
        }
        return found;
    }
    
    public static boolean containsLetter(String text) {
        String t = text;
        boolean found = false;
        for (char ch : t.toCharArray()) {
            if (Character.isLetter(ch)) {
                found = true;
            }  
        }
        return found;
    }
    
    public static boolean validName(String name) {
        if(containsNumber(name)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validSurname(String surname) {
        if(containsNumber(surname)) {
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validPostalCode(String postalCode) {
        if(postalCode.length() != 6 || containsLetter(postalCode)){
            return true;
        } else {
            return false;
        }
    }
    
    public static boolean validPhoneNumber(String phoneNumber) {
        if(phoneNumber.length() != 9 || containsLetter(phoneNumber)) {
            return true;
        } else {
            return false;
        }
    }
    
    
}
