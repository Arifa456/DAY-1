package com.ASS1;
import java.util.Scanner;
public class a3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {8, 9, 10, 11, 12, 13, 14, 15, 16};
        System.out.println("Enter number of rotations: ");
        int n = scanner.nextInt();
        System.out.println("Enter direction (L for left, R for right): ");
        char direction = scanner.next().charAt(0);
        if (direction == 'L' || direction == 'l') {
            rotateLeft(arr, n);
        } else if (direction == 'R' || direction == 'r') {
            rotateRight(arr, n);
        } else {
            System.out.println("Invalid direction! Please enter L for left or R for right.");
        }
        printArray(arr);
        scanner.close();
    }
    public static void rotateLeft(int[] arr, int n) {
        int length = arr.length;
        n = n % length; 
        int[] rotatedArr = new int[length];
        for (int i = 0; i < length; i++) {
            rotatedArr[i] = arr[( + n) % length];
        }
        System.arraycopy(rotatedArr, 0, arr, 0, length);
    }
    public static void rotateRight(int[] arr, int n) {
        int length = arr.length;
        n = n % length;
        int[] rotatedArr = new int[length];
        for (int a = 0; a < length; a++) {
            rotatedArr[(a + n) % length] = arr[a];
        }
        System.arraycopy(rotatedArr, 0, arr, 0, length);
    }
    public static void printArray(int[] arr) {
        System.out.print("Array after rotation: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
