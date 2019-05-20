package com.company;


public class Sequential_Search {
    //Recorretodo el array y va imprimiendo todos los valores que encuentra
    public void SequentialSearchMultiple(int[] array, int key){
        int counter=0;
        for(int i=0; i<array.length; i++){
            if( key == array[i]){
                counter++;
                System.out.println("Value: "+ key+" Found at Position: "+ i);
            }
        }
        System.out.println("The value repeats "+ counter + "  times in the array");
    }

//recorre el array hasta que encuentra el valor que se esta buscando
    public void SequentialSearch(int[] array, int key) {
        for(int i=0; i<array.length;i++){
                if (key == array[i]) {
                    System.out.println("Value: " + key + " Found at Position " + i);
                    break;
                }
        }
    }
}
