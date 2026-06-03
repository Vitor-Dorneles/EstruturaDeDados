package Aulas.Aula16Grafos;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> vertices = new ArrayList<>();
        //populando vertices
        vertices.add("a");
        vertices.add("b");
        vertices.add("c");
        vertices.add("d");
        vertices.add("e");

        //Trabalho 

        Grafo gAssimetrico = new Grafo(vertices);
        //a,b
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("a"), gAssimetrico.pegarIndice("b"));

        //b,c
        //gAssimetrico.inserirAresta(1, 2);
        gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("b"), gAssimetrico.pegarIndice("c"));

        //b,d
        gAssimetrico.inserirAresta(1, 3);

        //c,e
        gAssimetrico.inserirAresta(2, 4);
        
        //d,a
        gAssimetrico.inserirAresta(3, 0);
        
        //d,b
        gAssimetrico.inserirAresta(3, 1);
        
        //d,c
        gAssimetrico.inserirAresta(3,2);

        //e,d
        gAssimetrico.inserirAresta(4,3);

        gAssimetrico.mostrarMatriz();
        gAssimetrico.mostrarGrafo();
    }
}
