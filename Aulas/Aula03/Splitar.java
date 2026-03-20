package EstruturaDeDados.Aulas.Aula03;
import java.util.ArrayList;

public class Splitar {
    public static void main(String[] args) {
        ArrayList<Glicemia> lista = new ArrayList<>();
        
    // ler a linha
    String linha = "120,11/03/2026,9:00";
    
    // splitar a linha
    String vetorlinha[] = linha.split(",");
    
    // criar obj
    Glicemia obj = new Glicemia(Integer.parseInt(vetorlinha[0]), vetorlinha[1], vetorlinha[2]);
    
    //adicionar na lista
    if (!lista.contains(obj)) {
        lista.add(obj);
    }

    // exibir lista
    for (Glicemia item : lista){
    System.out.println(item.valor + "-" + item.data + "-" + item.hora);
    }
}

}