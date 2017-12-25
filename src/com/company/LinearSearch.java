/**
 * Linear Search - O(n)
 *
 * Linear Search is the most straight forward and basic searching algorithm. To find the value
 * it is looking for, it traverses the array and check each element until it finds or doesn't
 * find the value.
 *
 * The running time for Linear Search is O(n), that is the running time is directly proportional
 * to the value of n.
 */

package com.company;

public class LinearSearch {
    private int[] array;
    private int value;
    private int n;
    private int resIndex;

    LinearSearch(int[] inputArr, int valToFind) {
        this.array = inputArr;
        this.n = this.array.length;
        this.value = valToFind;

        search();
    }

    private void search() {
        // Loop through each element in the array
        for (int i = 0; i < n; i++) {
            // Check to see if the current iteration (being used as the index for the array)
            // matches the value to find.
            if (this.array[i] == this.value) {
                // Store the index in result index and break the loop
               resIndex = i;
               break;
            } else {
                // Else the value was not found, put a negative number in result index.
                resIndex = -1;
            }
        }
    }

    @Override
    public String toString() {
        // Returns a string of which index it found the value
        return value + " found at index " + resIndex;
    }
}
