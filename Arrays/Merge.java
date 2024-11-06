package com.example.Datastructure.Arrays;
public class Merge {

    // Method to merge two subarrays of arr[]
    public static void merge(int[] arr, int left, int middle, int right) {
        // Sizes of two subarrays to be merged
        int n1 = middle - left + 1;
        int n2 = right - middle;

        // Temporary arrays
        int[] leftArray = new int[n1];
        int[] rightArray = new int[n2];

        // Copy data to temporary arrays
        for (int i = 0; i < n1; i++) {
            leftArray[i] = arr[left + i];
        }
        for (int j = 0; j < n2; j++) {
            rightArray[j] = arr[middle + 1 + j];
        }

        // Initial indexes of the subarrays
        int i = 0, j = 0;

        // Initial index of the merged array
        int k = left;
        while (i < n1 && j < n2) {
            if (leftArray[i] <= rightArray[j]) {
                arr[k] = leftArray[i];
                i++;
            } else {
                arr[k] = rightArray[j];
                j++;
            }
            k++;
        }

        // Copy the remaining elements of leftArray[]
        while (i < n1) {
            arr[k] = leftArray[i];
            i++;
            k++;
        }

        // Copy the remaining elements of rightArray[]
        while (j < n2) {
            arr[k] = rightArray[j];
            j++;
            k++;
        }
    }

    // Method to implement merge sort
    public static void sort(int[] arr, int left, int right) {
        if (left < right) {
            // Find the middle point
            int middle = left + (right - left) / 2;

            // Recursively sort first and second halves
            sort(arr, left, middle);
            sort(arr, middle + 1, right);

            // Merge the sorted halves
            merge(arr, left, middle, right);
        }
    }

    // Utility method to print the array
    public static void printArray(int[] arr) {
        for (int value : arr) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {12, 11, 13, 5, 6, 7};

        System.out.println("Given Array:");
        printArray(arr);

        // Sort the array
        sort(arr, 0, arr.length - 1);

        System.out.println("\nSorted Array:");
        printArray(arr);
    }
}
