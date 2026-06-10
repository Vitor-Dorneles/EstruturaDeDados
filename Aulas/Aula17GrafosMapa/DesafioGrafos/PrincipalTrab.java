package Aulas.Aula17GrafosMapa.DesafioGrafos;

import java.util.ArrayList;

public class PrincipalTrab {
    public static void main(String[] args) {
        String caminho = "Aulas/Aula17GrafosMapa/DesafioGrafos/mapa.csv";
        ArrayList<String> vertices = LeitorCSV.lerVertices(caminho); //lerVertices já devolve ordenado e sem repetição
        //populando vertices
        //vertices.add("a");
        //GrafoTrab gAssimetrico = new GrafoTrab(vertices);
        //a,b
        //gAssimetrico.inserirAresta(gAssimetrico.pegarIndice("Arad"), gAssimetrico.pegarIndice("b"));
        
        // Trabalho
        System.out.println("Vertices encontrados: " + vertices);
        GrafoTrab grafoMap = new GrafoTrab(vertices);

        // 3. Lê as arestas e insere no grafo
        ArrayList<String[]> arestas = LeitorCSV.lerArestas(caminho);
        for (String[] aresta : arestas) {
            int origem = grafoMap.pegarIndice(aresta[0]);
            int destino = grafoMap.pegarIndice(aresta[1]);
            int custo = Integer.parseInt(aresta[2]);
            grafoMap.inserirAresta(origem, destino, custo);
        }

        // grafoMap.mostrarMatriz();
        grafoMap.mostrarGrafo();
    }
}
