package com.company;
import java.util.Random;
public class Insertion {
public void Insert(int[] array){
    Random rand = new Random();
    //inserta numeros aleatoreos de 0-10000
    for(int i=0; i<array.length; i++){
        array[i]= rand.nextInt(10001);
    }
}
}
