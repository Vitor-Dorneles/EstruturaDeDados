import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class leituraDados {
    public static void main(String[] args) {
        List<dadosClimaticos> lista = new ArrayList<>();
        String nomeBase = "dadosClimaticos.csv";

        // O try-with-resources já fecha o arquivo automaticamente (igual ao 'with' do Python)
        try (BufferedReader leitor = new BufferedReader(
                new FileReader(nomeBase, StandardCharsets.UTF_8))) {
            
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] dadosLinha = linha.split(",");
                
                dadosClimaticos objdadosClimaticos = new dadosClimaticos(dadosLinha[0],dadosLinha[1],dadosLinha[2], dadosLinha[3]);

                // Requer que o método equals() esteja implementado na classe dadosClimaticos
                if (!lista.contains(objdadosClimaticos)) {
                    lista.add(objdadosClimaticos);
                }
            }

            for (dadosClimaticos item : lista) {
                System.out.println(item);
            }

        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }
    }
}
