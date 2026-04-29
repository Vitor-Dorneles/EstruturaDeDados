package Aulas.Aula11.TrabalhoAvaliativo;

import java.util.List;
import java.util.Scanner;

public class AlunoDados {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(null, null, null, 0);
        Scanner teclado = new Scanner(System.in);

        List<Aluno> listaAlunos = aluno.lerArquivo("Aulas/Aula11/TrabalhoAvaliativo/alunos.csv");

        // aluno.ordenarPorCursoEAno(listaAlunos);
        // aluno.contarAlunosPorAno(listaAlunos);
        // aluno.exibirDados(listaAlunos);
        // aluno.buscaNome(listaAlunos, "Vitor");
        int opcao = -1;
        System.out.println("Menu de Gestão Acadêmica");
        do {
            System.out.println("1-Ordenação da lista por curso e exibição");
            System.out.println("2-Ordenação por ano de Ingresso, desconsiderando curso");
            System.out.println("3-Ordenação por mais antigos no curso");
            System.out.println("4-Encontrar aluno na lista");
            System.out.println("5-Total de alunos por ano de ingresso");
            System.out.println("0-SAIR");
            
            opcao = teclado.nextInt();
            teclado.nextLine();
            switch (opcao) {
                case 1:
                    System.out.println("Ordenando por curso: ");
                    aluno.ordenarAlunosCurso(listaAlunos);
                    aluno.exibirDados(listaAlunos);                
                    break;
                case 2:
                    System.out.println("Ordenação por ingresso");
                    aluno.ordenarAlunosAntigos(listaAlunos);
                    aluno.exibirDados(listaAlunos);
                    break;
                case 3:
                    System.out.println("Ordenação por mais antigos em cada curso");
                    aluno.ordenarPorCursoEAno(listaAlunos);
                    aluno.exibirDados(listaAlunos);
                    break;
                case 4:
                    System.out.println("Digite um nome completo para ser buscado na lista de alunos");
                    String nome = teclado.nextLine();
                    Aluno encontrado = aluno.buscaNome(listaAlunos, nome);

                    if (encontrado != null) {
                        System.out.println("\nAluno encontrado");
                        System.out.println("Nome:" + encontrado.getNome() + "\tCurso: " + encontrado.getCurso() + "\tAno: "
                                + encontrado.getAnoIngresso());
                    }
                    break;
                case 5:
                    System.out.println("\nTotal de Alunos por Ano");
                    aluno.contarAlunosPorAno(listaAlunos);
                    break;
                case 0:
                    System.out.println("Sistema encerrado");

                default:
                    System.out.println("Opção inválida");
                    break;
            }
            
        } while (opcao != 0);
        
        teclado.close();
    }
    
}
