package com.company;

public class SearchDriver {

    public static void main(String[] args) {
        int[] inputArr = new int[]{1, 2, 3, 4, 5, 6};
        int valueToFind = 5;

        System.out.println("Linear Search");
        System.out.println(new LinearSearch(inputArr, valueToFind));

        // Note: list must be sorted to use binary search
        System.out.println("Binary Search");
        System.out.println(new BinarySearch(inputArr, valueToFind));


    }
}
