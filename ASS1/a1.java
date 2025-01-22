package com.ASS1;
import java.util.HashMap;
public class a1 {
    public static void main(String[] args) {
        String input = "India";
        countCharacterFrequency(input);
    }
    public static void countCharacterFrequency(String str) {
        str = str.toLowerCase();
        HashMap<Character, Integer> charFrequency = new HashMap<>();
        for (char c : str.toCharArray()) {
            if (Character.isLetter(c)) {
                charFrequency.put(c, charFrequency.getOrDefault(c, 0) + 1);
            }
        }
        for (char c : charFrequency.keySet()) {
            System.out.println("Character '" + c + "' appears " + charFrequency.get(c) + " times.");
        }
    }
}
