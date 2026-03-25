import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class leituraDados {
    public static void main(String[] args) {
        List<dadosClimaticos> lista = new ArrayList<>();
        String nomeBase = "EstruturaDeDados/Aulas/Aula04/dadosClimaticos.csv";
        // O try-with-resources já fecha o arquivo automaticamente (igual ao 'with' do
        // Python)
        
        try (BufferedReader leitor = new BufferedReader(
                new FileReader(nomeBase, StandardCharsets.UTF_8))) {

            String linha; // vai virar 2020,Janeiro,Quente,muita
            while ((linha = leitor.readLine()) != null) {
                String[] dadosLinha = linha.split(","); // aqui separar por vírgulas 

                dadosClimaticos objdadosClimaticos = new dadosClimaticos(dadosLinha[0], dadosLinha[1], dadosLinha[2],
                        dadosLinha[3]); // campos do csv empacotados em um objeto

                // Requer que o método equals() esteja implementado na classe dadosClimaticos
                if (!lista.contains(objdadosClimaticos)) { // evita duplicados
                    lista.add(objdadosClimaticos);     //compara o objeto novo com os existentes
                }
            }
            Map<String, Integer> contagemChuva = new HashMap<>(); // vai guardar quantos meses no ano tiveram precipitação "muita"
            Map<String, Integer> contagemQuente = new HashMap<>(); // guarda o "quente"

            for (dadosClimaticos item : lista) { // percorre cada objeto da lista
                String ano = item.getAno(); // pega o ano da linha

                if (item.getPrecipitacao().equalsIgnoreCase("muita")) {
                    int atual = contagemChuva.getOrDefault(ano, 0);
                    contagemChuva.put(ano, atual + 1);
                }
                if (item.getTemperatura().equalsIgnoreCase("quente")) {
                    int atual = contagemQuente.getOrDefault(ano, 0);
                    contagemQuente.put(ano, atual + 1);
                }
            }
            System.out.println("Contagem de meses com muita chuva por ano: " + contagemChuva);
            System.out.println("Contagem de meses com temperatura quente por ano: " + contagemQuente);

            List<String> anoMaisChuvoso = new ArrayList<>();
            int maiorChuva = -1; //começa assim para garantir que qualquer contagem seja maior

            for (int qtd : contagemChuva.values()) {
                if (qtd > maiorChuva) {
                    maiorChuva = qtd;
                }
            }
            for (Map.Entry<String, Integer> entry : contagemChuva.entrySet()) { // percorre cada par (ano,contagem)
                String ano = entry.getKey();
                int qtd = entry.getValue();

                if (qtd == maiorChuva) { // quando achar uma contagem maior, atualiza
                    anoMaisChuvoso.add(ano);
                    
                }
            }
            System.out.println("Ano que mais choveu : " + anoMaisChuvoso + " (" + maiorChuva + ")");

            String anoMaisQuente = null;
            int maiorQuente = -1;

            for (Map.Entry<String, Integer> entry : contagemQuente.entrySet()) {
                String ano = entry.getKey();
                int qtd = entry.getValue();

                if (qtd > maiorQuente) {
                    maiorQuente = qtd;
                    anoMaisQuente = ano;
                }
            }
            System.out.println("Ano mais quente: " + anoMaisQuente + " (" + maiorQuente + ")");


        } catch (Exception e) {
            System.err.println("Ocorreu algum erro... " + e.getMessage());
        }
        // Desafio: Descobrir o ano que mais choveu e o ano mais quente

    }
}
