package com.company;

public class Main {

    public static void main(String[] args) {
	Insertion insertion= new Insertion();
	Sequential_Search search = new Sequential_Search();

	int[] Array = new int[100000];
        insertion.Insert(Array);
        search.SequentialSearchMultiple(Array);
        search.SequentialSearch(Array);
    }
}
