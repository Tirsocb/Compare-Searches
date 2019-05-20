# Compare-Searches
***
## Objective
Compare search times between an array and a Binary tree.

the array will be searched using the following algorithms:
* Sequential
* Exponential

Numbers from 1 to 10000 will be inserted into randomly to the array, the array will have a size of 100,000.

Numbers from 1 to 10000 will be inserted into the Binary tree, the program will automatically sort them and 100,000 values will be inserted.

## What do I expect?

Mi hipótesis es que el programa mas eficiente va a ser el del árbol porque:
1. sequential tiende a ser bastante ineficiente en un arreglo desordenado, con una complejidad, (en el peor de los casos) de O(n).
2. exponential requiere que el arreglo esté ordenado de forma asendente y ordenarlo toma recursos, en el caso de este trabajo utilizaré Quicksort para ordenar el arrelo ya que en el caso promedio es el algoritmo de sorting mas rapido con una complejidad de o(n log n) en este tipo casos.

