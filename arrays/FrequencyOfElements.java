package com.arrays;
public class FrequencyOfElements {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1};
        for (int i = 0; i < arr.length; i++) 
        {
            int count = 1;
            boolean visited = false;
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    visited = true;
                    break;
                }
            }
            if (!visited) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] == arr[j]) {
                        count++;
                    }
                }

                System.out.println(arr[i] + ":" + count);
            }
        }
    }
}