package com.company;

public class ExpSearch {
    BinarySearch Bs= new BinarySearch();
private int returnSmaller(int a, int b){
    if(a>b){
        return b;
    }else if(a==b){
        return b;
    }else{
        return a;
    }
}
    public int exponentialSearch(int[] array, int arraySize, int key){
        if(array[0]== key){
            return 0;
        }
        int i=1;
        while(i<arraySize && array[i]<=key) {
            i *= 2;
        }
        return Bs.binarySearch(array, i/2, returnSmaller(i, arraySize), key);
    }

}
