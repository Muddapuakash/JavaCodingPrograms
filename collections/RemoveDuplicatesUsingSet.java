package com.collections;
import java.util.*;

public class RemoveDuplicatesUsingSet {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 3, 4, 4, 5};

        // HashSet → No order
        Set<Integer> hashSet = new HashSet<>();

        for (int num : arr) {
            hashSet.add(num);
        }

        System.out.println("HashSet: " + hashSet);

        // LinkedHashSet → Maintains insertion order
        Set<Integer> linkedHashSet = new LinkedHashSet<>();

        for (int num : arr) {
            linkedHashSet.add(num);
        }

        System.out.println("LinkedHashSet: " + linkedHashSet);
    }
}