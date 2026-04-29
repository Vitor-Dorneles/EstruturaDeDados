package Aulas.Aula11.TrabalhoAvaliativo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Aluno {
    private String nome;
    private String curso;
    private String sexo;
    private int anoIngresso;

    public Aluno(String nome, String curso, String sexo, int anoIngresso) {
        this.nome = nome;
        this.curso = curso;
        this.sexo = sexo;
        this.anoIngresso = anoIngresso;
    }

    public List<Aluno> lerArquivo(String caminho) { // vai devolver uma lista
        List<Aluno> listaAlunos = new ArrayList<>();
        File arquivo = new File(caminho);

        try (Scanner leitor = new Scanner(arquivo)) {

            while (leitor.hasNextLine()) {
                String linha = leitor.nextLine();
                String[] dados = linha.split(",");

                String nome = dados[0];
                String curso = dados[1];
                String sexo = dados[2];
                int ano = Integer.parseInt(dados[3]); // converte pois o vetor do split era string

                Aluno aluno = new Aluno(nome, curso, sexo, ano);

                boolean repetido = false;

                for (Aluno alunoSalvo : listaAlunos) {

                    if (alunoSalvo.getNome().equalsIgnoreCase(aluno.getNome())
                            && alunoSalvo.getAnoIngresso() == aluno.getAnoIngresso()) {
                        repetido = true;
                        break;
                    }
                }

                if (repetido == false) {
                    listaAlunos.add(aluno);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Aconteceu algum erro.");
        }

        return listaAlunos;
    }

    public void ordenarAlunosCurso(List<Aluno> listaAlunos) {
        listaAlunos.sort(Comparator.comparing(Aluno::getCurso));
    }

    public void ordenarAlunosAntigos(List<Aluno> listaAlunos) {
        listaAlunos.sort(Comparator.comparing(Aluno::getAnoIngresso));
    }

    public void ordenarPorCursoEAno(List<Aluno> listaAlunos) {
        listaAlunos.sort(Comparator.comparing(Aluno::getCurso).thenComparing(Aluno::getAnoIngresso));
    }

    public Aluno buscaNome(List<Aluno> listaAlunos, String nomeBuscado) {
        for (Aluno aluno : listaAlunos) {
            if (aluno.getNome().equalsIgnoreCase(nomeBuscado)) {
                return aluno;
            }
        }
        System.out.println("Aluno não encontrado");
        return null;       
    }
    
    public void contarAlunosPorAno(List<Aluno> listaAlunos) {
        int cont2020 = 0;
        int cont2021 = 0;
        int cont2022 = 0;
        int cont2023 = 0;

        for (Aluno aluno : listaAlunos) {

            if (aluno.getAnoIngresso() == 2020) {
                cont2020++;
            } else if (aluno.getAnoIngresso() == 2021) {
                cont2021++;
            } else if (aluno.getAnoIngresso() == 2022) {
                cont2022++;
            } else if (aluno.getAnoIngresso() == 2023) {
                cont2023++;
            }
        }

        System.out.println("\nAlunos por Ano");
        System.out.println("Ano 2020: " + cont2020 );
        System.out.println("Ano 2021: " + cont2021 );
        System.out.println("Ano 2022: " + cont2022 );
        System.out.println("Ano 2023: " + cont2023 );
    }

    public void exibirDados(List<Aluno> listaAlunos) {
        System.out.println("Lista de Alunos");
        for (Aluno aluno2 : listaAlunos) {
            System.out.println("Nome: " + aluno2.getNome() + "\tCurso: " + aluno2.getCurso() + "\tSexo: "
                    + aluno2.getSexo() + "\tAno de início: " + aluno2.getAnoIngresso());
        }
        System.out.println("Total Adicionado: " + listaAlunos.size());
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getCurso() {
        return curso;
    }
    public void setCurso(String curso) {
        this.curso = curso;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
    public int getAnoIngresso() {
        return anoIngresso;
    }
    public void setAnoIngresso(int anoIngresso) {
        this.anoIngresso = anoIngresso;
    }


}