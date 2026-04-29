package Aulas.Aula11.TrabalhoAvaliativo;

import java.util.List;

public class AlunoDados {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(null, null, null, 0);

        List<Aluno> listaAlunos = aluno.lerArquivo("Aulas/Aula11/TrabalhoAvaliativo/alunos.csv");

        aluno.exibirDados(listaAlunos);
    }
    
}
