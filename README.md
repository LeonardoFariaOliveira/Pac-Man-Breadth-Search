# Pac-Man-Breadth-Search
Algoritmo de busca em largura utilizado para fazer o pac-man encontrar as moedas presentes no mapa, começando pela mais próxima
<img src='https://github.com/LeonardoFariaOliveira/Pac-Man-Breadth-Search/assets/66142358/9034c516-11cc-42ff-b28e-c410ffbd0b04'/>

# Problema
O problema consistia no pac-man estar em qualquer posição no mapa e ter que buscar as duas moedas presentes no mapa, começando pela mais proxima

# Solução
Primeiro mapeei o mapa do pac-man que consta na imagem em grafos, onde cada bolinha de caminho possível é um nó e possui nós vizinhos(adjacentes). 
Sendo assim como era puramente posição de vetor e números inteiros trabalhei apenas com números e um atributo que dizia se aquela posição continha uma moeda ou não:
* pos
* coin

Ao fazer o mapeamento, de forma abstrata atribui um número para cada bolinha de caminho possível do nó, assim se uma posição possui duas bolinhas possíveis para caminhar, 
eu crio 2 objetos nó com a mesma posição no vetor porém pos diferentes. Exemplo:
A bolinha que eu atribui o número 2 possui 2 caminhos possíveis então crio 2 objetos
<img src='https://github.com/LeonardoFariaOliveira/Pac-Man-Breadth-Search/assets/66142358/83322526-5feb-427b-92d7-de2bcb642b3a'/>


Depois de criar o grafo, apliquei o algoritmo de busca em largura usando as classes: ListIterator, LinkedList, Queue e Stack do Java

## Instalação

```bash
$ git clone https://github.com/LeonardoFariaOliveira/Pac-Man-Breadth-Search
$ cd Pac-Man-Breadth-Search
```

## Running the app

```bash
$ javac Main.java
# java Main <posição-de-partida(número de 1 a 106>
$ java Main 52
```
