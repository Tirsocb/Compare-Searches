package com.company;
import java.util.Random;

public class Insertion {


public void Insert(int[] array){
    Random rand = new Random();

    for(int i=0; i<100000; i++){
        array[i]= rand.nextInt(10001);
    }


}



}
