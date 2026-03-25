// Data: 18/03/2026
public class dadosClimaticos {
    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;

    public dadosClimaticos(String ano, String mes, String temperatura, String precipitacao) { // construtor
        this.ano = ano;
        this.mes = mes;
        this.temperatura = temperatura;
        this.precipitacao = precipitacao;
    }
    // para o computador localizar no print, não precisamos printar cada variavel depois de fazer isso
    // reescrevemos o toStrign para exibir um objeto completo da classe
    @Override
    public String toString() {
        return "dadosClimaticos [ano=" + this.ano + ", mes=" + this.mes + ", temperatura=" + this.temperatura + ", precipitacao="
                + this.precipitacao + "]";
    }
    
    @Override
    public boolean equals(Object obj) { // reescrevemos o método equals para definir os atributos identificadores
        dadosClimaticos c =(dadosClimaticos)obj; // Transformamos o OBJ em "clima" , (cast)
        return (this.ano .equals(c.ano) && this.mes.equals(c.mes)); // se dois registros tiverem o mesmo ano e mesmo mes eles são considerados iguais

      
    }

    public String getAno() {
        return this.ano;
    }
    
    public String getTemperatura() {
        return this.temperatura;
    }

    public String getPrecipitacao() {
        return this.precipitacao;
    }
    
}