package com.ASS1;
import java.util.Arrays;
public class a2 {
    public static void main(String[] args) {
        String str1 = "car";
        String str2 = "rac";
        if (areAnagrams(str1, str2)) {
            System.out.println(str1 + " and " + str2 + " are anagrams.");
        } else {
            System.out.println(str1 + " and " + str2 + " are not anagrams.");
        }
    }
    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        char[] charA1 = str1.toCharArray();
        char[] charA2 = str2.toCharArray();
        Arrays.sort(charA1);
        Arrays.sort(charA2);
        return Arrays.equals(charA1, charA2);
    }
}
