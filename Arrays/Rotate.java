package com.example.Datastructure.Arrays;

public class Rotate {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        System.out.println("Original array:");
        printArray(array);
        leftShiftArray(array);
        System.out.println("Array after one left shift:");
        printArray(array);
    }
    public static void leftShiftArray(int[] array) {
        int firstElement = array[0];
        int i;
        for (i = 0; i < array.length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[i] = firstElement;
    }

    public static void printArray(int[] array) {
        for (int element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

