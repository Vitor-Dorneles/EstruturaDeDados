package Aulas.Aula12Recursao;

import java.util.ArrayList;

// Data: 06/05/2026
public class RecursaoExemplo {
    static void mostrarSequenciaRecursao(int numero) {

    }
 

    static void mostrarSequenciaDecrescente(int numero) {
        //variavel de controle ==> numero
        for (; numero >= 0; numero--) {
            System.out.println(numero);
        }
    }

    static void mostrarSequenciaDecrescenteR(int numero) {
        if (numero >= 0) {
            System.out.println(numero);
            mostrarSequenciaDecrescenteR(numero -1);

        }
    }

    static void mostrarSequenciaCrescenteR(int numero) {
        if (numero >= 0) {
            mostrarSequenciaCrescenteR(numero - 1);
            System.out.println(numero);
        }
    }

    static void mostrarIntervaloR(int ini, int fim) {
        if (ini <= fim) {
            System.out.println(ini);
            mostrarIntervaloR(ini+ 1, fim);
        }
    }

    static void mostrarIntervalo(int ini, int fim) {
        for (; ini <= fim; ini++) {
            System.out.println(ini);
        }
    }

    static void mostrarLista(ArrayList<Integer> lista) {
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }
        // for (Integer i : lista) {
        //     System.out.println(i);

        // }
    }

    static void mostrarParesListaR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            mostrarParesListaR(lista, n - 1);
            if (lista.get(n - 1) % 2 == 0) {
                System.out.println(lista.get(n-1));
            } 
        }
    }
    
    static void mostrarListaR(ArrayList<Integer> lista, int n) {
        if (n > 0) {
            System.out.println((n - 1));
            mostrarListaR(lista, n - 1);
        }
    }
    
    static void substituirR(ArrayList<Integer> lista, int n, int procurado, int substituto) {
        if (n > 0) {
            substituirR(lista, n - 1, procurado, substituto);
            if (lista.get(n - 1) == procurado) {
                lista.set(n - 1, substituto);
            }
        }
    }
    
    public static void main(String[] args) {
        //int numero = 3;
        //mostrarSequenciaCrescente(numero);
        //mostrarSequenciaDecrescente(numero);
        //mostrarSequenciaRecursao(numero); //mostrar a sequencia de 0 até n

        //mostrarIntervaloR(3, 6);

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(20);
        lista.add(30);
        lista.add(40);
        lista.add(55);
        mostrarListaR(lista, lista.size());
        mostrarParesListaR(lista, lista.size());
        substituirR(lista, lista.size(), 30, 100);
        mostrarParesListaR(lista, lista.size());
    }
}