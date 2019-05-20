package com.company;
import java.util.Random;



public class Main {

    public static void main(String[] args) {
       
        Random rand = new Random();
        int key = rand.nextInt(10001);
        Insertion insertion = new Insertion();
        Sequential_Search search = new Sequential_Search();

        int[] Array = new int[100000];
        insertion.Insert(Array);
        //search.SequentialSearch(Array, key);
        search.SequentialSearchMultiple(Array, key);



    }
}

