package com.backend.Search.Interpolation_Search;

public class InterpolationSearch{

    public static void main(String[] args){

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        int index = interpolationSearch(array, 8);

        if(index != -1) {
            System.out.println("Element found at index: "+ index);
        }
        else {
            System.out.println("Element not found");
        }
    }

    private static int interpolationSearch(int[] array, int targetValue) {

        int rightValue = array.length - 1;
        int leftValue = 0;

        while(targetValue >= array[leftValue] && targetValue <= array[rightValue] && leftValue <= rightValue) {

            int tryValue = leftValue + (rightValue - leftValue) * (targetValue - array[leftValue]) /
                    (array[rightValue] - array[leftValue]);

            if(array[tryValue] == targetValue) {
                return tryValue;
            }
            else if(array[tryValue] < targetValue) {
                leftValue = tryValue + 1;
            }
            else {
                rightValue = tryValue - 1;
            }
        }
        return -1;
    }
}