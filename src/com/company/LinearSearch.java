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
        for (int i = 0; i < n; i++) {
            if (this.array[i] == this.value) {
               resIndex = i;
               break;
            } else {
                resIndex = -1;
            }
        }
    }

    @Override
    public String toString() {
        return value + " found at index " + resIndex;
    }
}
