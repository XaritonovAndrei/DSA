package com.backend.Search.Binary_Search;

import java.util.Arrays;

public class BinarySearch {
    public static void main(String[] args) {
        int[] array = new int[1000];
        int targetValue = 374;
        for (int i=0; i<array.length; i++) {
            array[i] = i;
        }
        int index = binarySearch(array, targetValue);
            System.out.println(index);
    }

    public static int binarySearch(int[] array, int targetValue) {
        int leftIndex = 0;
        int rightIndex = array.length - 1;

        while(leftIndex <= rightIndex) {
            int middleIndex = leftIndex + ((rightIndex - leftIndex) / 2);

            int middleValue = array[middleIndex];

            if(targetValue < middleValue) {
                rightIndex = middleIndex - 1;
            }
            else if(targetValue > middleValue) {
                leftIndex = middleIndex + 1;
            }
            else return middleValue;
        }
    return -1;
    }
}
