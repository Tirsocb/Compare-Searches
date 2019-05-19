package com.company;
import java.util.Random;
public class Quicksort {
   private void intercambiar(int[] array, int a, int b){
       int temporal= array[a];
       array[a]=array[b];
       array[b]= temporal;
   }
   private int getPivot(int inferior, int superior){
       Random rand = new Random();

       return rand.nextInt((superior-inferior)+1)+inferior;
   }
   private int particion(int[] array, int inferior, int superior){
       intercambiar(array, inferior,getPivot(inferior,superior));
       int borde = inferior+1;
    for(int i=borde;i<=superior; i++){
        if(array[i]<array[inferior]){
            intercambiar(array, i, borde++);
        }
    }
    intercambiar(array,inferior,borde-1);
       return borde-1;
   }
   private void quickSort(int[] array, int inferior, int superior){
        if(inferior< superior +1){
            int p = particion(array, inferior,superior);
            quickSort(array,inferior,p-1);
            quickSort(array,p+1,superior);
        }
    }
    public void quickSort(int[] array){
       quickSort(array, 0, array.length-1);
    }




}
