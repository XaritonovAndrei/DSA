package com.backend.Sort.Quick_Sort;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {8, 7, 9, 2, 3, 1, 5, 4, 6};
        quickSort(array, 0, array.length - 1); // start (left) pointer = 0;
                                                                   // end (right) pointer = array.length - 1;

        for (int e : array) {
            System.out.print(e + " ");
        }

    }

    public static void quickSort(int[] array, int startPointer, int endPointer) {
        if (endPointer <= startPointer) { return; } // base case - when algorithm stops
        int pivot = partition(array, startPointer, endPointer); // find pivot
        quickSort(array, startPointer, pivot - 1); // sort left part of array (excluding pivot)
        quickSort(array, pivot + 1, endPointer); // sort right part of array (excluding pivot)

    }

    // method for finding pivot location
    public static int partition(int[] array, int startPointer, int endPointer) {

        int pivot = array[endPointer];

        int i = startPointer - 1;
        for (int j = startPointer; j <= endPointer - 1; j++) {
            if (array[j] < pivot) {
                i++;
                int temp = array[i];
                array[i] = array[j];
                array[j] = temp;
            }
        }

        i++;
        int temp = array[i];
        array[i] = array[endPointer];
        array[endPointer] = temp;

        return i; // location of pivot
    }
}



