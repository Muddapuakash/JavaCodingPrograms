package com.arrays;

public class LargestSmallestElement {
    public static void main(String[] args) {
        int[] arr = {3, 7, 1, 9, 4};

        int largest = arr[0];
        int smallest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
    }
}