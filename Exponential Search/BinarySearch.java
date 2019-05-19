package com.company;

public class BinarySearch {
    public int binarySearch(int[] array, int lowerbound, int upperbound, int key) {


        if (upperbound >= lowerbound) {
            int centro = lowerbound + (upperbound - lowerbound) / 2;
            if (array[centro] == key) {
                return centro;
            }

            if (array[centro] > key) {
                return binarySearch(array, lowerbound, centro - 1, key);
            } else {
                return binarySearch(array, centro + 1, upperbound, key);
            }
        }

        return -1;


    }
}