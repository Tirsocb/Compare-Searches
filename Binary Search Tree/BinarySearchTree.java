package com.company;

class BinarySearchTree {
//clase Node contiene los hijos de ambos lados, el valor que guarda y la ocurrencia de dicho valor en el dataset
    class Node {
        int key;
        Node izquierda, derecha;
        int occurence;


        public Node(int item) {
            key = item;
            izquierda = derecha = null;
            occurence = 1;
        }
    }
//Nodo Raíz
    Node root;
//constructor del BST
    BinarySearchTree() {
        root = null;
    }

    //utiliza recursion (se llama a ella misma) para insertar y clasificar los valores en el arbol
    void insertar(int key) {
        root = insercion(root, key);
    }
   private Node insercion(Node raiz, int key) {
        //si la raiz esta vacia poner el valor en la raiz
        if (raiz == null) {
            raiz = new Node(key);
            return raiz;
        } else if (key == raiz.key) {//si el valor que se desea ingresar ya existe solo se le suma uno a la ocurrencia
            raiz.occurence += 1;
            return raiz;
        }

        //si el valor es menor que el valor del nodo que esta siento comparado,se vuelve su hijo izquierdo
        if (key < raiz.key)
            raiz.izquierda = insercion(raiz.izquierda, key);
        else if (key > raiz.key)//si el valor es mayor que el valor del nodo que esta siento comparado,se vuelve su hijo derecho
            raiz.derecha = insercion(raiz.derecha, key);


        return raiz;
    }

 //busqueda iterativa
    boolean buscar(int key){
        return busqueda(root, key);
    }
    private boolean busqueda(Node root, int key) {
        //reocrrer el arbol hasta que el nodo sea null
        while (root != null) {
            if (key > root.key) {
                root = root.derecha;
            }else if (key < root.key) {
                root = root.izquierda;
            }// si no es mayor ni menor es igual
            else{
                System.out.println("value found, it occurs "+ root.occurence+" times in the dataset");
                return true; }
        }
        return false;
    }






        /*void inorder() {
        printAscendente(root);
    }
    void printAscendente(Node root) {
        if (root != null) {
            printAscendente(root.izquierda);
            System.out.println(root.key+" occurs: "+ root.occurence+" times in the dataset");
            printAscendente(root.derecha);
        }
    }*/
}
