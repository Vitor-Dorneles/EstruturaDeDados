// Data: 03/06/2026
# Estrutura de Dados
* Físicas : Variaveis -> RAM
* Abstratas: 
    * Algoritmos + Coleções
      * Lineares
        - ORDEM - lista
        - LIFO - Pilha { add, remove, contains, size, empty, index
        - FIFO - Fila
      * Não Lineares
        - Arvore
          - genéricas  { add, remove, contains, size, empty, **Recursão**
          - binárias
            * pesquisa/busca
              * ordenação

# Estrutura de Dados - Grafos
- Lineares
- Não Lineares
    - Árvore
    - **Grafo** ==ED==Coleção
      * Roteamento=Percurso=Encaminhamento
        * Track ou route
      * Representar:
        * Mapas { Rodoviário, Equipamento, Rodoviário, Ferroviário
                               {Rede Elétrica, Informática}

**Lista** é a Estrutura de Dados mais básica de todas,
com a lista conseguimos construir uma **pilha**
com a pilha construimos uma **fila**
com uma fila constuimos uma **árvore**
e com uma árvore construimos um **grafo**

No grafo encontramos todas as Estruturas
O **Grafo** serve para representar mapas, 
## Conceitos
- Bolinha == Nó ou Vértice
  - V = {a,b,c}
- Linha == Aresta
    Ex Conexões entre nodos : A={a,b; b,c; b,d; c,e; d,a; d,b; d,c; e,d;}
                a,b == a---->b
                b,a == b---->a
- Grau
  - Representadas pelas ---> no desenho, são representadas as chegadas e saidas
  - Grau total == Chegadas e saidas
  - Grau de Incidência == Chegada
  - Grau de Partida == Saida
- Simetria
  - Simétrico, os melhores, onde temos rotas de ida e vinda
  - Assimétrico == Digrafo, temos restrição de rotas
- Representação
  - Disco
  - RAM

**Vamos aprender a percorrer**
## Representação
  - Matriz de adjacência
    - QTD Linhas == QTD de vértices
    - QTD COLUNAS == QTD de vértices
    - Arestas 
      - Assimétrica
      - Simétrica
  
```java
class Grafo{
    int matrizAD[][];
    int qtdVertices;

    public Grafo(int qtdVertices){
        this.qtdVertices = qtdVertices;
        this.matrizAD[][]= new int [qtdVertices][qtdVertices];
        inicializar matrizAD
    }
}

void mostrarMatriz(){}
void mostrarGrafo(){}
void inserirAresta(int origem, int destino){}
void inserirArestaSimetrica(int origem, int destino){}
```

