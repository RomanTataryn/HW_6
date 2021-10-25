package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        System.out.println("Task 1");
        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(3);
        list1.add(9);
        list1.add(11);
        list1.add(18);
        list1.add(20);
        list1.add(22);
        System.out.println(list1);
        list1.removeIf(i -> i % 3 == 0);
        System.out.println("List without 3-divisible elements: " + list1);

        System.out.println("Task 2");
        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Apple");
        list2.add("Orange");
        list2.add("Plumb");
        list2.add("Orange");
        list2.add("Pineapple");
        System.out.println(list2);
        int k = 0; // count of element "Orange" in list2
        for (int i = 0; i < list2.size(); i++) {
            if (list2.contains("Orange")) {
                list2.set(list2.indexOf("Orange"), "Grapefruit");
                k++;
            }
        }
        if (k == 0) {
            System.out.println("list2 don't contains element 'Orange'.");
        } else System.out.println(list2);

        System.out.println("Task 3");
        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(8);
        list3.add(-3);
        list3.add(18);
        list3.add(0);
        list3.add(1010);
        list3.add(55);
        ArrayList<Integer> list4 = new ArrayList<>();
        list4.add(57);
        list4.add(10);
        list4.add(18);
        System.out.println(list3);
        System.out.println(list4);
        list3.retainAll(list4);
        if (list3.size() > 0) {
            System.out.println("Arraylists have " + list3.size() + " similar elements: " + list3);

        } else
            System.out.println("Arraylists do not have similar elements");

    }
}
