package com.ASS1;
public class ass7 {
    public static void main(String[] args) {
        int[] array1 = {2, 4, 6, 8, 10, 12, 14};
        int[] array2 = {4, 8, 12, 16, 20, 24, 28};
        if (array1.length == array2.length) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[j] > array2[j]) {
                    System.out.println("element " + (j + 1) + ": array1 is greater than array2");
                } else if (array1[j] < array2[j]) {
                    System.out.println("element " + (j + 1) + ": array1 is less than array2");
                } else {
                    System.out.println("element " + (j + 1) + ": array1 is equal to array2");
                }
            }
        } else {
            System.out.println("arrays are not of the same size.");
        }
    }
}
