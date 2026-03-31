// Data: 25/03/2026
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;


public class Estruturas {
    public static void gerarProcessos(ArrayList<Processo> lista, Scanner teclado) { //método irmão do main, para ser chamado tem que ser static

        int id;
        String descricao;
        Random gerador = new Random();
        Processo tmp;

        while (true) {
            id = gerador.nextInt(500);
            System.out.print("Descrição do processo: ");
            descricao = teclado.nextLine().toUpperCase();
            if (descricao.equals("SAIR")) {
                break;
            }
            tmp = new Processo(id, descricao); // Aqui vai comparar com os outros ids, lá no equals foi definido a chave
                                               // primária
            if (!lista.contains(tmp)) {
                lista.add(tmp);
            }
        }
    
    }
    public static void localizarProcessos(ArrayList<Processo> lista, Scanner teclado) {
        String descricao;
        System.out.println("Digite a palavra ou expressao que deseja localizar: ");
       
        descricao = teclado.nextLine().toUpperCase();

        for (Processo p : lista) {
            if (p.descricao.contains(descricao)) {
                System.out.println(p);
            }
        }
    }

    public static void exibirProcessos(ArrayList<Processo> lista) {
        System.out.println("Quantidade de processos: " + lista.size());

        lista.sort((p1, p2) -> p1.descricao.compareTo(p2.descricao));

        for (Processo p : lista) {
            System.out.println(p);
        }

    }

    public static void removerProcessos(ArrayList<Processo> lista, Scanner teclado) {
        int removidos = 0;
        String termo;
        System.out.println("Digite a palavra ou expressao que deseja remover: ");
        termo = teclado.nextLine().toUpperCase();
        
        Iterator<Processo> it = lista.iterator();
        while (it.hasNext()) {
            Processo p = it.next();
            if (p.descricao.contains(termo)) {
                it.remove(); // remove com segurança durante iteração
                removidos++;
            }
        }
        System.out.println("Removidos: " + removidos);
        
    }
        public static void main(String[] args) {
        ArrayList<Processo> lista = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);

        Estruturas.gerarProcessos(lista, teclado);
        Estruturas.exibirProcessos(lista);
        Estruturas.localizarProcessos(lista, teclado);
        // deafio... fazer o remove processos que tenham uma palavra ou expressao
        Estruturas.removerProcessos(lista, teclado);


       // lista.add(new Processo(1, "abertura"));
       // lista.add(new Processo(500, "teste de clock"));
       // lista.add(new Processo(45, "fechamento de válvula"));
       // lista.add(new Processo(1, "outro processo"));

       teclado.close(); // fecha os teclados geral

       
        
    }
    
}
