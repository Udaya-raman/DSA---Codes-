package com.example.Datastructure.Arrays;

public class ShiftMultiplePosition  {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int numberOfShifts = 2; // Number of positions to shift

        // Print the original array
        System.out.println("Original array:");
        printArray(array);

        // Perform the left shift
        leftShiftArray(array, numberOfShifts);

        // Print the array after the left shifts
        System.out.println("Array after " + numberOfShifts + " left shifts:");
        printArray(array);
    }

    // Method to perform multiple left shifts on the array
    public static void leftShiftArray(int[] array, int numberOfShifts) {
        int length = array.length;
        // Normalize the number of shifts to be within the array length
        numberOfShifts = numberOfShifts % length;

        // Temporary array to store the first 'numberOfShifts' elements
        int[] temp = new int[numberOfShifts];
        
        // Copy the first 'numberOfShifts' elements to the temporary array
        for (int i = 0; i < numberOfShifts; i++) {
            temp[i] = array[i];
        }

        // Shift the remaining elements to the left
        for (int i = 0; i < length - numberOfShifts; i++) {
            array[i] = array[i + numberOfShifts];
        }

        // Place the temporary elements at the end of the array
        for (int i = 0; i < numberOfShifts; i++) {
            array[length - numberOfShifts + i] = temp[i];
        }
    }

    // Method to print the array
    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
