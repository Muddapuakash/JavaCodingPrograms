package com.collections;

import java.util.HashMap;
import java.util.Map;

public class HighestFrequencyElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 1, 2, 4, 1, 1};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            if (map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            } else {
                map.put(num, 1);
            }
        }

        int maxKey = 0;
        int maxValue = 0;

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }

        System.out.println("Highest Frequency Element: " + maxKey);
        System.out.println("Frequency: " + maxValue);
    }
}
