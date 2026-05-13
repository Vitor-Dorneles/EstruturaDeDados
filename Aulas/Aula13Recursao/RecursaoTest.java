import java.util.ArrayList;
import java.util.Random;

public class RecursaoTest {
    //Recursão é um recurso computacional de programação que substitui as instruções de repetição (for-while)
//toda repetição obdece 3 pontos
    // A- inicialização da variavel de controle
    // B - teste de parada com a variavel de controle
    // C - transformação da variavel de controle

    public static void popular(ArrayList<Integer> lista, int quantidade) {
        Random gerador = new Random();
        int numero;
        for (int i = 0; i < quantidade; i++) {
            numero = gerador.nextInt(100);
            lista.add(numero);
        }
    }

    public static void exibir(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
    }

    public static void exibirR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            // codigo antes do empilhamento
            System.out.println(lista.get(n - 1));
            exibirR(lista, n - 1);
            // codigo depois do empilhamento
            System.out.println(lista.get(n - 1));
        }
    }

    public static int somarParesR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            int soma;
            if (lista.get(n - 1) % 2 == 0) {
                soma = lista.get(n - 1) + somarParesR(lista, n - 1);
            } else {
                soma = 0 + somarParesR(lista, n - 1);
            }
            return soma;
        }
        return 0;
    }

    public static int somarR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            int soma = lista.get(n - 1) + somarR(lista, n - 1);
            return soma;
        }
        return 0;
    }

    public static int pesquisarListaR(ArrayList<Integer> lista, int n, int valorPesquisa) {
        int valorBuscado;
        if (n > 0) {
            if (lista.get(n - 1) == valorPesquisa) {
                valorBuscado = 1; 
                pesquisarListaR(lista, n - 1, valorPesquisa);
            } else {
                pesquisarListaR(lista, n - 1, valorPesquisa);
                valorBuscado = 0;
            }
            int soma = valorBuscado + pesquisarListaR(lista, n - 1, valorPesquisa);
            return soma;
        }
        return 0;
    }

        public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<Integer>();
        int quantidade = 4;
        //popular(lista, quantidade);
        lista.add(15);
        lista.add(14);
        lista.add(11);
        lista.add(15);
        System.out.println(lista);
        System.out.println(somarParesR(lista, quantidade));
        System.out.println("Valor buscado é 15");
        int valor = 15;
        // pesquisarListaR(lista, quantidade, valor);
        System.out.println("Ele apareceu "+ pesquisarListaR(lista, quantidade, valor) + " vezes");

    }


}
