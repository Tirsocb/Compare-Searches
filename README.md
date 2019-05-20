# Compare-Searches
***
## Objective
Compare search times between an array and a Binary Search tree.

the array will be searched using the following algorithms:
* Sequential
* Exponential

Numbers from 1 to 10000 will be inserted into randomly to the array, the array will have a size of 100,000.

Numbers from 1 to 10000 will be inserted into the Binary Search tree, the program will automatically sort them and 100,000 values will be inserted.

## What do I expect?

Mi hipótesis es que el programa mas eficiente va a ser el del árbol porque:
1. sequential tiende a ser bastante ineficiente en un arreglo desordenado, con una complejidad, (en el peor de los casos) de O(n).
2. exponential requiere que el arreglo esté ordenado de forma asendente y ordenarlo toma recursos, en el caso de este trabajo utilizaré Quicksort para ordenar el arrelo ya que en el caso promedio es el algoritmo de sorting mas rapido con una complejidad de o(n log n) en este tipo casos.

## Results
### Memory
el programa que menos memoria uso en general fue el Binary search tree (6.72 MB) seguido por la búsqueda secuencial que utilizó 6.82 MB, de último lugar quedo la busqueda exponencial (12.3 MB) porque requiere de Quicksort, por ende requiere mas recursos.

Evaluando metodo por metodo la busqueda secuencial utilizo solamente 16 bytes en el método de busqueda, la exponencial 32 bytes y el árbol 249 kb, una posible causa de que utilizó mas memoria fue porque los nodos del arbol que fue implementado guardan dos valores, tambien es posible que si se hubiera usado recursion en la busqueda el uso en memoria hubiera aumentad  ya que la recursion utiliza mas el call stack

### CPU
El programa que menos usó el CPU fue la búsqueda secuencial (3.42%), seguido por el árbol (3.93%) y de último la búsqueda exponencial (5.17%) por la misma razon en la cual quedó de último lugar en memoria

analizando el tiempo de busqueda, el programa que mas rápido encontró el valor fue el Binary Search Tree (11.975 ms), seguido por la búsqueda secuencial (19.896 ms) y de ultimo exponential search (36.926 ms) porque tiene que ordenar el array antes de la búsqueda.

## Conclusion
el mejor de los programas de busqueda que fueron comparados, el Binary search Tree es el mejor de todos porque utiliza menos memoria y es mas rapido en encontrar valores. Cada uno tiene sus respectivas ventajas, por ejemplo sería inutil implementar una busqueda exponencial en un arreglo que tiene menos de 100 posiciones, en ese caso lo mejor es implementar una busqueda secuencial.*

de no haber tenido que ordenar el arreglo antes de hacer la busqueda exponencial, esta le hubiera ganado en la mayoría de los casos, si no es que en todos, a la búsqueda secuencial.

*cabe mencionar que en los programas anteriores cada uno tiene un arreglocon valores diferentes y se buscan valores diferentes, por lo cual los resultados pueden variar, los resultados del estudio realizado son un promedio de múltiples ejecuciones de dichos programas.

### A note on Profiling
si quieren ver el profiling completeo, subi los snapshots de Jprofiler

puede instalar Jprofiler aqui https://www.ej-technologies.com/products/jprofiler/overview.html [Jprofiler]
