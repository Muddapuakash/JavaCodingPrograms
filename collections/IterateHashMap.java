package com.collections;

import java.util.*;

public class IterateHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "Java");
        map.put(2, "Python");
        map.put(3, "C++");

        // 1. keySet()
        System.out.println("Using keySet():");
        for (Integer key : map.keySet()) {
            System.out.println(key + " -> " + map.get(key));
        }

        // 2. entrySet()
        System.out.println("\nUsing entrySet():");
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // 3. forEach()
        System.out.println("\nUsing forEach():");
        map.forEach((key, value) -> {
            System.out.println(key + " -> " + value);
        });

        // 4. Iterator
        System.out.println("\nUsing Iterator:");
        Iterator<Map.Entry<Integer, String>> itr = map.entrySet().iterator();

        while (itr.hasNext()) {
            Map.Entry<Integer, String> entry = itr.next();
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}