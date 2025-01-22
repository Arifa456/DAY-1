package com.ASS1;
public class a4 {
    public static void main(String[] args) {
        int[] arr = {-2, 3, -1, 5, -2, 1, 1, -8, 4};
        int maxSum = findMaxSubarraySum(arr);
        System.out.println("Max sum of contiguous subarray: " + maxSum);
    }
    public static int findMaxSubarraySum(int[] arr) {
        int maxSoFar = arr[0];  
        int maxEndingHere = arr[0];  
        for (int a = 1; a < arr.length; a++) {
            maxEndingHere = (arr[a] > maxEndingHere + arr[a]) ? arr[a] : maxEndingHere + arr[a];
            maxSoFar = (maxSoFar > maxEndingHere) ? maxSoFar : maxEndingHere;
        }
        return maxSoFar;
    }
}
