/**
 * Binary Search - O(log n)
 *
 * Binary Search is a logarithmic search, which means in the worst case, it will
 * take time log(n) (n being the size of the array) to fully search the array.
 *
 * Binary Search works by first checking the mid point of n and if the value we are
 * looking for happens to be the midpoint, then our search is complete.
 *
 * If the value is less than the mid point, we know the value has to be on the left ha-
 * nd side, and if it's greater, it will be on the right hand.
 *
 * If the value is not the middle, then we have to choose a side, let's say the value
 * we are looking for is less than the mid point, so we go to the left side.
 *
 * We then choose the midpoint of the left side, see check it its the value we are
 * looking for and if not, choose a side again etc. keep doing this until the value
 * has been found (or not found).
 *
 * Example:
 *
 * Lets say that the size of the array (n) we are searching is 32
 *
 * 0th iteration - 32 (n)
 * 1st iteration - 16 (n/2^1)
 * 2nd iteration - 8 (n/2^2)
 * 3rd iteration - 4 (n/2^3)
 * 4th iteration - 2 (n/2^4)
 * 5th iteration - 1 (n/2^5)
 *
 * 32 gets halved 5 times to reach 1 which you cannot cut in half further. 5 is also
 * the base 2 log of 32 or log(32) = 5 which means in the worst case (value we are
 * looking for doesn't appear in the array at all) it will take 5 iterations to fully
 * search the array.
 */

package com.company;

public class BinarySearch {
    private int[] array;
    private int value;
    private int resIndex = -1; // Set result index to -1 when. This will not be updated if the value is not found

    BinarySearch(int[] inputArr, int valToFind) {
        this.array = inputArr;
        this.value = valToFind;

        search();
    }

    private void search() {
        // Bootstrap binarySearch passing the array, low index of zero, high index of the length of the array
        // and the value to search
        binarySearch(this.array, 0, this.array.length-1, this.value);
    }

    private void binarySearch(int[] arr, int low, int high, int val) {

        // If high > low, we have more than a one element array
        if (high >= low) {
            // Calculate the mid
            int mid = low + (high - low) / 2;

            // If the value we are looking for is the mid, then we have found it.
            if (arr[mid] == val) {
                this.resIndex = mid;
            } else if (arr[mid] > val) {
                // Recursively call binarySearch again but only for the left sub array
                binarySearch(arr, low, mid - 1, val);
            } else {
                // Else the value must be in the right hand side if it exists
                binarySearch(arr, mid + 1, high, val);
            }
        }
    }

    @Override
    public String toString() {
        // Returns a string of which index it found the value
        return value + " found at index " + resIndex;
    }
}
