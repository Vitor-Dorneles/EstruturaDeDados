package Aulas.Aula16Grafos;

import java.util.ArrayList;

public class Grafo {
    int matrizADJ[][];
    int qtdVertices;
    ArrayList<String> vertices;

    public Grafo(ArrayList<String> vertices) {
        this.vertices = new ArrayList<>();
        this.vertices.addAll(vertices); //passagem por clonagem, boa prática
        this.qtdVertices = vertices.size();
        this.matrizADJ = new int[qtdVertices][qtdVertices];

        // inicializar com 0 a matriz que representa o grafo
        for (int i = 0; i < qtdVertices; i++) {
            for (int j = 0; j < qtdVertices; j++) {
                this.matrizADJ[i][j] = 0;
            }
        }
    }
    
    void mostrarMatriz() { // não é tão usado no contexto de grafos
        for (String vertice : this.vertices) {
            System.out.print("  " + vertice);
        }
        System.out.println();

        for (int i = 0; i < qtdVertices; i++) {
            System.out.print(this.vertices.get(i) + " ");
            for (int j = 0; j < qtdVertices; j++) {
                System.out.print(matrizADJ[i][j] + "  ");
            }
            System.out.println();
        }
    }

    void mostrarGrafo() {
        for (int i = 0; i < this.qtdVertices; i++) {
            System.out.print(this.vertices.get(i) + ": ");
            for (int j = 0; j < this.qtdVertices; j++) {
                if (this.matrizADJ[i][j] != 0) {
                    System.out.print(this.vertices.get(j) + "   ");
                }
            }
            System.out.println();
        }
    }
    
    void inserirAresta(int origem, int destino) {
        if (this.matrizADJ[origem][destino] == 0) {
            this.matrizADJ[origem][destino] = 1;
        }
    }

    int pegarIndice(String vertice) {
        //pegamos da lista o indice do vertice
        //retorna o indice na lista de vertices um vertice
        // vertice um nó ou nodo
        return this.vertices.indexOf(vertice);
    }

}
