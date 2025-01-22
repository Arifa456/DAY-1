package com.ASS1;
import java.util.Stack;
public class a10 {
    public static void main(String[] args) {
        // Test cases
        String T1 = "()[]{}";
        String T2 = "(]";
        String T3 = "({[]})";
        String T4 = "{[}]";
        System.out.println("T1: " + isValid(T1)); // true
        System.out.println("T2: " + isValid(T2)); // false
        System.out.println("T3: " + isValid(T3)); // true
        System.out.println("T4: " + isValid(T4)); // false
    }
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
