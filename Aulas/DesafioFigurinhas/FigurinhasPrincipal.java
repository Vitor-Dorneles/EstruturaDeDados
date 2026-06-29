package Aulas.DesafioFigurinhas;

import java.util.Scanner;
import java.util.TreeSet;

public class FigurinhasPrincipal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        TreeSet<Figurinhas> arvoreRepeditdas = new TreeSet<>();
        TreeSet<Figurinhas> arvoreDesejadas = new TreeSet<>();

        System.out.println("Carregando arquivos do sistema");
        GerenciarCSV.carregarArquivo("Aulas/DesafioFigurinhas/ArquivosCSV/figuras_repetidas_pessoais.csv", arvoreRepeditdas);
        GerenciarCSV.carregarArquivo("Aulas/DesafioFigurinhas/ArquivosCSV/Figuras_desejadas_pessoais.csv", arvoreDesejadas);

        int opcao = 0;
        do {
            System.out.println("   FIGURINHAS COPA 26");
            System.out.println("===================================");
            System.out.println("1 - Cadastrar figurinhas repetidas pessoais");
            System.out.println("2 - Listar figurinhas repetidas pessoais");
            System.out.println("3 - Cadastrar figuras desejadas pessoais");
            System.out.println("4 - Listar figuras desejadas pessoais");
            System.out.println("5 - Carregar figuras repetidas OUTRO (Match com desejadas)");
            System.out.println("6 - Carregar figuras desejadas OUTRO (Match com repetidas)");
            System.out.println("7 - Sair");
            System.out.print("Selecione a opção: ");
            opcao = teclado.nextInt();
            teclado.nextLine();

            switch (opcao) {
               case 1:
                   System.out.println("\nCadastrar Repetida");
                   System.out.println("Nome da seleção: ");
                   String selecaoRep = teclado.nextLine();
                   System.out.println("Numero da Figurinha");
                   int numeroRep = teclado.nextInt();
                   teclado.nextLine();

                   System.out.println("Descrição: (nome) ");
                   String desc = teclado.nextLine();

                   System.out.println("Quantidade: ");
                   int qtd = teclado.nextInt();
                   teclado.nextLine();

                   System.out.println("Raridade:(true/false)");
                   boolean raridade = teclado.nextBoolean();
                   teclado.nextLine();

                   Figurinhas novaRepetida = new Figurinhas(selecaoRep, numeroRep, desc, qtd, raridade);

                   arvoreRepeditdas.add(novaRepetida);
                   GerenciarCSV.salvarFiguraCSV("figuras_repetidas_pessoais.csv", novaRepetida);
                   System.out.println("Figurinha salva");
                    break;
                case 2:
                    System.out.println("\n As Minhas Repetidas");
                    if (arvoreRepeditdas.isEmpty()) {
                        System.out.println("Nenhuma encontrada, cadastre");
                    } else {
                        for (Figurinhas obj : arvoreRepeditdas) {
                            System.out.println(obj.toString());
                        }
                    }
                    break;
                case 3:
                    System.out.println("\n Cadastrar Figurinha Desejada");
                    System.out.println("Nome da Seleção:");
                    String selecaoDes = teclado.nextLine();

                    System.out.println("Número da Figurinha: ");
                    int numeroDes = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Descrição: (nome)");
                    String descDes = teclado.nextLine();

                    System.out.println("Quantidade: ");
                    int qtdDes = teclado.nextInt();
                    teclado.nextLine();

                    System.out.println("Rara? (true/false)");
                    boolean raraDes = teclado.nextBoolean();
                    teclado.nextLine();

                    Figurinhas novaDesejada = new Figurinhas(selecaoDes, numeroDes, descDes, qtdDes, raraDes);

                    arvoreDesejadas.add(novaDesejada);
                    GerenciarCSV.salvarFiguraCSV("Aulas/DesafioFigurinhas/ArquivosCSV/Figuras_desejadas_pessoais.csv",
                            novaDesejada);
                    
                    System.out.println("Figurinha cadastrada");

                    break;
                case 4:
                    System.out.println("\nAs Minhas Figurinhas Desejadas");
                    if (arvoreDesejadas.isEmpty()) {
                        System.out.println("Nenhuma figurinha, cadastre");
                    } else {
                        for (Figurinhas figurinha : arvoreDesejadas) {
                            System.out.println(figurinha.toString());
                        }
                    }
                    break;
                case 5:
                    System.out.println("\nProcurar Matches (arquivo do Outro)");
                    System.out.println("Digite o nome do caminho do arquivo");
                    String arquivoOutroRep = teclado.nextLine();

                    TreeSet<Figurinhas> arvoreOutroRep = new TreeSet<>();
                    GerenciarCSV.carregarArquivo(arquivoOutroRep, arvoreOutroRep);

                    if (arvoreOutroRep.isEmpty()) {
                        System.out.println("O arquivo não foi encontrado, ou está vazio");
                    } else {
                        System.out.println("\n Figurinhas de: " + arquivoOutroRep);

                        for (Figurinhas figOutro : arvoreOutroRep) {
                            System.out.println(figOutro.toString());
                            if (arvoreDesejadas.contains(figOutro)) {
                                System.out.println("Match de troca, uma figura desejada");
                            }
                        }
                    }
                    break;
                case 6:
                    System.out.println("\nProcurar Matches no arquivo do OUTRO");
                    System.out.println("Digite o nome do caminho do arquivo csv do outro (desejadas)");
                    String arquivoOutDes = teclado.nextLine();

                    TreeSet<Figurinhas> arvoreOutDes = new TreeSet<>();

                    GerenciarCSV.carregarArquivo(arquivoOutDes, arvoreOutDes);

                    if (arvoreOutDes.isEmpty()) {
                        System.out.println("O arquivo não foi encontrado, ou está vazio");
                    } else {
                        System.out.println("\nFigurinhas de: " + arquivoOutDes);

                        for (Figurinhas fig : arvoreOutDes) {
                            System.out.println(fig.toString());

                            if (arvoreRepeditdas.contains(fig)) {
                                System.out.println("Match, voce tem essa figurinha para trocar");
                            }
                        }
                    }
                    break;
                case 7:
                    System.out.println("\n Saindo do programa");
                    break;
                default:
                    System.out.println("\nOpção INVÁLIDA");
            }
            System.out.println();
        } while (opcao != 7);
    teclado.close();       
    }
    
}
