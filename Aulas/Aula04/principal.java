import java.util.ArrayList;

import desafio.dadosClimaticos;

public class principal {
    public static void main(String[] args) {
        ArrayList<dadosClimaticos> lista = new ArrayList<>();

        // simulando que estamos lendo linha a linha do arquivo
        String linha = "2020,Janeiro,Quente,muita";
        // dadosClimaticos umClima = new dadosClimaticos("2020", "Janeiro", "Quente", "muita");
        String dadosLinha[] = linha.split(",");
        dadosClimaticos objDadosClimaticos = new dadosClimaticos(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3]);


        linha = "2020,Janeiro,frio,pouca";
        dadosLinha = linha.split(",");
        objDadosClimaticos = new dadosClimaticos(dadosLinha[0], dadosLinha[1], dadosLinha[2], dadosLinha[3]);
        if(!lista.contains(objDadosClimaticos)){
            lista.add(objDadosClimaticos);

        }

        for(dadosClimaticos c : lista){
            System.out.println(c);
        }
        


        System.out.println("Exibindo dados de um mês: "+ objDadosClimaticos);

    }
    
}
