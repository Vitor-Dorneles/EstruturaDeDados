package Aulas.Aula17GrafosMapa.DesafioGrafos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class LeitorCSV {

    // lê apenas (cidades) do CSV
    public static ArrayList<String> lerVertices(String caminho) {

        ArrayList<String> vertices = new ArrayList<>(); //lista vazia

        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(arquivo); //linha a linha
            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] partes = linha.split(",");

                String origem = partes[0].trim(); //trim para remover espaços
                String destino = partes[1].trim();
                // partes[2] é o custo "140"

                if (!vertices.contains(origem)) {
                    vertices.add(origem);
                }
                if (!vertices.contains(destino)) {
                    vertices.add(destino);
                }
            }

            leitor.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        vertices.sort(null);
        return vertices;
    }

    // lê as ARESTAS do CSV — agora guarda origem, destino E custo
    public static ArrayList<String[]> lerArestas(String caminho) {

        ArrayList<String[]> arestas = new ArrayList<>();

        try {
            FileReader arquivo = new FileReader(caminho);
            BufferedReader leitor = new BufferedReader(arquivo);
            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] partes = linha.split(",");

                String origem = partes[0].trim(); // ex: "Arad"
                String destino = partes[1].trim(); // ex: "Sibiu"
                String custo = partes[2].trim(); // ex: "140"

                // guarda os 3 juntos num array de 3 posições
                arestas.add(new String[] { origem, destino, custo });
            }

            leitor.close();

        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }

        return arestas;
    }
}