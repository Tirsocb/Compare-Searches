package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        BinarySearchTree tree = new BinarySearchTree();
        //se ingresan 100,000 datos al arbol, los datos son numeros generados aleatoreamente y etran en un rango de 0 a 10,000
        for (int i = 0; i <100000 ; i++) {
            tree.insertar(rand.nextInt(10001));
        }

        //busqueda
        if (tree.buscar(rand.nextInt(10001))) {
            System.out.println("EXISTE");
        }else {
            System.out.println("NO EXISTE EN EL DATASET");
        }
       //tree.inorder();


    }
}
