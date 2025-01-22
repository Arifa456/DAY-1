package com.ASS1;

public class a6 {

    public static void main(String[] args) {
        System.out.println(isPalindrome("No lemon, no melon"));
        System.out.println(isPalindrome("Hello, World!"));
    }

    public static boolean isPalindrome(String str) {
        String cleanStr = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleanStr.equals(new StringBuilder(cleanStr).reverse().toString());
    }
}

