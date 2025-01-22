package com.ASS1;
public class a8 {
    public static void main(String[] args) {
        String input = "Arifa";
        countVowelsAndConsonants(input);
    }
    public static void countVowelsAndConsonants(String str) {
        String cleanStr = str.toLowerCase();
        int vowelCount = 0;
        int consonantCount = 0;
        for (char c : cleanStr.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
            	switch (c) {
                    case 'a':
                    case 'e':
                    case 'i':
                    case 'o':
                    case 'u':
                        vowelCount++;
                        break;
                    default:
                        consonantCount++;
                }
            }
        }
        System.out.println("Vowels: " + vowelCount);
        System.out.println("Consonants: " + consonantCount);
    }
}
