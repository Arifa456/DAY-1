package com.ASS1;
public class ass9 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4};
        boolean[] visited = new boolean[arr.length];
        for (int a = 0; a < arr.length; a++) {
            if (visited[a]) {
                continue;
            }
            int count = 1;
            for (int b = a + 1; b < arr.length; b++) {
                if (arr[a] == arr[b]) {
                    count++;
                    visited[b] = true;
                }
            }
            System.out.println(arr[a] + " OCC " + count + " times.");
        }
    }
}