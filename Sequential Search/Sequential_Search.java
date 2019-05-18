package com.company;
import java.util.Random;

public class Sequential_Search {
    public void SequentialSearchMultiple(int[] array){
        Random rand = new Random();
        int key = rand.nextInt(10000);
        for(int i=0; i<array.length; i++){
            if( key == array[i]){
                System.out.println("Value: "+ key+"Found at Position"+ i);
            }
        }
    }

    public void SequentialSearch(int[] array) {
        Random rand = new Random();
        int key = rand.nextInt(10000);
        for(int i=0; i<array.length;i++){
                if (key == array[i]) {
                    System.out.println("Value: " + key + " Found at Position " + i);
                    break;
                }
        }
    }
}
