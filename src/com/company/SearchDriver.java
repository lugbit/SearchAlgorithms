package com.company;

import javax.sound.sampled.Line;

public class SearchDriver {

    public static void main(String[] args) {
        int[] inputArr = new int[]{3, 6, 9, 12, 15, 18, 21, 24, 27};
        int valueToFind = 12;

        System.out.println("Linear Search");
        System.out.println(new LinearSearch(inputArr, valueToFind));
    }
}
