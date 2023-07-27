package me.wyderekk.utils;

public class StringUtils {
    
    public static boolean containsNumber(String text) {
        boolean found = false;
        char[] chars = text.toCharArray();
        for(char c : chars) {
            if(Character.isDigit(c)) {
                found = true;
            }
        }
        return found;
    }
    
    public static boolean containsLetter(String text) {
        boolean found = false;
        for (char ch : text.toCharArray()) {
            if (Character.isLetter(ch)) {
                found = true;
            }  
        }
        return found;
    }
    
    public static boolean validName(String name) {
        return containsNumber(name);
    }
    
    public static boolean validSurname(String surname) {
        return containsNumber(surname);
    }
    
    public static boolean validPostalCode(String postalCode) {
        return postalCode.length() != 6 || containsLetter(postalCode);
    }
    
    public static boolean validPhoneNumber(String phoneNumber) {
        return phoneNumber.length() != 9 || containsLetter(phoneNumber);
    }
}
