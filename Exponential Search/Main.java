package com.company;

import java.util.Random;
public class Main {

    public static void main(String[] args) {

       

        Insertion insertion= new Insertion();
        Quicksort Qs = new Quicksort();
        BinarySearch Bs= new BinarySearch();
        Random rand = new Random();
        ExpSearch Es= new ExpSearch();

        int[] Array = new int[100000];
        int key= rand.nextInt(10001);
        insertion.Insert(Array);
        Qs.quickSort(Array);
        //System.out.println(Bs.binarySearch(Array,0,Array.length-1,key));
        int result = Es.exponentialSearch(Array, Array.length, key);

        System.out.println((result < 0) ?  "Element is not present in array" : "Element is present at index " + result);


    }
}
