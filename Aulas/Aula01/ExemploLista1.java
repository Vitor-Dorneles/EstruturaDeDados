package Aulas.Aula01;

import java.util.ArrayList; // import lista que podemos adicionar e remover sem tamanho fixo
import java.util.Scanner; // import para ler do teclado

public class ExemploLista1 {

    public static void main(String[] args) {
        ArrayList<String> listaNomes = new ArrayList<>(); //Listas funcionam apenas para objetos
        Scanner teclado = new Scanner(System.in);
        String nome; // String nome é um objeto

        // Adicionando elementos 
        listaNomes.add("Guilherme");
        listaNomes.add("Maria");

        System.out.println("Lista atual: " + listaNomes);

        // Verificando se a lista não está vazia
        if (!listaNomes.isEmpty()) { //isEmpty verifica se está vazia
            // o ! converte a ideia, seria "verifica se a lista não está vazia"
            System.out.print("Digite um nome para remover: ");
            nome = teclado.nextLine(); // le a linha inteira do usuario

            // busca e remoção
            if (listaNomes.contains(nome)) { //verificação se o nome existe
                listaNomes.remove(nome); //remoção
                System.out.println("O nome '" + nome + "' foi removido com sucesso.");
            } else {
                System.out.println("O nome '" + nome + "' não foi encontrado na lista.");
            }
        }

        System.out.println("Lista final: " + listaNomes);
        
        teclado.close();
    }
}