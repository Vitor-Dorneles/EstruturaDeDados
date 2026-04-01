import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Desafio: Descobrir o ano que mais choveu e o ano mais quente
public class leituraDados {
    public static void main(String[] args) {
        List<dadosClimaticos> lista = new ArrayList<>(); // criação da lista que vai guardar os dados do csv
        String nomeBase = "EstruturaDeDados/Aulas/Aula04/dadosClimaticos.csv";
        
        //leitor do arquivo nomeBase
        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeBase, StandardCharsets.UTF_8))) {

            String linha; // vai virar 2020,Janeiro,Quente,muita
            // verifica se a linha do arquivo não é null
            while ((linha = leitor.readLine()) != null) {
                String[] dadosLinha = linha.split(","); // aqui separar por vírgulas em um array dadosLinha

                dadosClimaticos objdadosClimaticos = new dadosClimaticos(dadosLinha[0], dadosLinha[1], dadosLinha[2],
                        dadosLinha[3]); // campos do csv empacotados em um objeto novo

                // Requer que o método equals() esteja implementado na classe dadosClimaticos
                if (!lista.contains(objdadosClimaticos)) { // evita duplicados
                    lista.add(objdadosClimaticos); //compara ano + mês com os dados existentes
                }
            }
            // hashmap é como uma tabela (chave->valor)

            //mapa onde a chave é texto (ano=2020) e o valor de contagem é integer (int)
            Map<String, Integer> contagemChuva = new HashMap<>(); // vai contar quantos meses no ano tiveram precipitação "muita"
            Map<String, Integer> contagemQuente = new HashMap<>(); // conta o "quente"

            for (dadosClimaticos item : lista) { // percorre cada objeto da lista com "item" recebendo os dados da lista
                String ano = item.getAno(); // pega o ano da linha e guarda na variavel local

                if (item.getPrecipitacao().equalsIgnoreCase("muita")) { // compara o campo precipitaçao que tá no "item" ai se for "muita" faz a adição
                    int atual = contagemChuva.getOrDefault(ano, 0); // ve se o ano já está no mapa, se não existe coloca 0
                    // e se existe pega o valor dele para somar
                    contagemChuva.put(ano, atual + 1); // coloca no mapa o novo valor de ano 
                }
                if (item.getTemperatura().equalsIgnoreCase("quente")) {
                    int atual = contagemQuente.getOrDefault(ano, 0);
                    contagemQuente.put(ano, atual + 1);
                }
            }
            System.out.println("Contagem de meses com muita chuva por ano: " + contagemChuva); //exibindo 
            System.out.println("Contagem de meses com temperatura quente por ano: " + contagemQuente);

            List<String> anoMaisChuvoso = new ArrayList<>(); //lista pra guardar os anos que mais choveram
            int maiorChuva = -1; //começa assim para garantir que qualquer contagem seja maior

            for (int qtd : contagemChuva.values()) { //percorre os anos guardadados pra retornar só os números da contagem
                if (qtd > maiorChuva) {
                    maiorChuva = qtd;
                }
            }
            for (Map.Entry<String, Integer> entry : contagemChuva.entrySet()) { // retorna cada par (ano,contagem)
                String ano = entry.getKey(); // tipo string, pega o (2020)
                int qtd = entry.getValue(); 

                if (qtd == maiorChuva) { // compara pra adicionar esse ano na lista
                    anoMaisChuvoso.add(ano);
                    
                }
            }
            System.out.println("Ano que mais choveu : " + anoMaisChuvoso + " (" + maiorChuva + ")");

            List<String> anoMaisQuente = new ArrayList<>();
            int maiorQuente = -1;


            for (int qtd : contagemQuente.values()) {
                if (qtd > maiorQuente) {
                    maiorQuente = qtd;
                }
            }

            for (Map.Entry<String, Integer> entry : contagemQuente.entrySet()) {
                String ano = entry.getKey();
                int qtd = entry.getValue();

                if (qtd == maiorQuente) {
                    anoMaisQuente.add(ano);
                }
            }
            System.out.println("Ano mais quente: " + anoMaisQuente + " (" + maiorQuente + ")");


        } catch (Exception e) {
            System.err.println("Ocorreu algum erro" + e.getMessage());
        }


    }
}
