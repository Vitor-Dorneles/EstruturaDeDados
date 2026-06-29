package Aulas.DesafioFigurinhas;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.TreeSet;

public class GerenciarCSV {
    
    public static void carregarArquivo(String caminhoArquivo, TreeSet<Figurinhas> arvorinha) {
        File arquivo = new File(caminhoArquivo);

        if (!arquivo.exists()) {
            return;
        }

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo, StandardCharsets.UTF_8))) {

            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] campos = linha.split(",");

                if (campos.length == 5) {
                    String selecao = campos[0].trim();
                    int numero = Integer.parseInt(campos[1].trim());
                    String descricao = campos[2].trim();
                    int quantidade = Integer.parseInt(campos[3].trim());
                    boolean rara = Boolean.parseBoolean(campos[4].trim());

                    Figurinhas figura = new Figurinhas(selecao, numero, descricao, quantidade, rara);

                    arvorinha.add(figura);
                }
            }
        } catch (IOException e) {
            System.err.println("Ocorreu algum erro" + e.getMessage());
        }
    }

    public static void salvarFiguraCSV(String caminhoArquivo, Figurinhas figura) {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(caminhoArquivo, true))) {

            String linhaCSV = figura.getNomeSelecao() + "," + figura.getNumeroFigura() + "," + figura.getDescricao()
                    + "," + figura.getQuantidade() + "," + figura.isRaridade();

            escritor.write(linhaCSV);
            escritor.newLine();

        } catch (IOException e) {
            System.out.println("Ocorreu algum erro: " + e.getMessage());
        }
    }
}

