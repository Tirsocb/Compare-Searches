package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] Array = new int[100000];
        Insertion insertion= new Insertion();
        Quicksort Qs = new Quicksort();
        insertion.Insert(Array);
        Qs.quickSort(Array);
        System.out.println(Arrays.toString(Array));
    }
}
