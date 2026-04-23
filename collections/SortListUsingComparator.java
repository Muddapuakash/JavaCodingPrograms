package com.collections;

import java.util.*;

public class SortListUsingComparator {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);

        // Ascending Order
        Collections.sort(list, (a, b) -> a - b);
        System.out.println("Ascending: " + list);

        // Descending Order
        Collections.sort(list, (a, b) -> b - a);
        System.out.println("Descending: " + list);
    }
}
