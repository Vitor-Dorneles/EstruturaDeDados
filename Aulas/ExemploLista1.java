package EstruturaDeDados.Aulas;

import java.util.ArrayList;
import java.util.Scanner;

public class ExemploLista1 {

    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);
        String nome;

        // Adicionando elementos 
        listaNomes.add("Guilherme");
        listaNomes.add("Maria");

        System.out.println("Lista atual: " + listaNomes);

        // Verificando se a lista não está vazia
        if (!listaNomes.isEmpty()) {
            System.out.print("Digite um nome para remover: ");
            nome = teclado.nextLine();

            // busca e remoção
            if (listaNomes.contains(nome)) {
                listaNomes.remove(nome);
                System.out.println("O nome '" + nome + "' foi removido com sucesso.");
            } else {
                System.out.println("O nome '" + nome + "' não foi encontrado na lista.");
            }
        }

        System.out.println("Lista final: " + listaNomes);
        
        teclado.close();
    }
}