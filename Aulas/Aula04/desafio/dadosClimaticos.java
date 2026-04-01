package desafio;
// Data: 18/03/2026
public class dadosClimaticos {
    //criação do objeto pros campos do csv
    public String ano;
    public String mes;
    public String temperatura;
    public String precipitacao;

    //construtor recebe os campos e gurda no objeto
    public dadosClimaticos(String ano, String mes, String temperatura, String precipitacao) {
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
    //equals compara se os objetos são iguais
    public boolean equals(Object obj) { // reescrevemos o método equals para definir os atributos identificadores
        dadosClimaticos c =(dadosClimaticos)obj; // Transformamos o OBJ em "dadosClimaticos" , (cast) e guardamos em "C"
        return (this.ano .equals(c.ano) && this.mes.equals(c.mes)); // se dois registros tiverem o mesmo ano e mesmo mes eles são considerados iguais

      
    }

    public String getAno() { //retorna o ano do objeto
        return this.ano;
    }
    
    public String getTemperatura() {
        return this.temperatura;
    }

    public String getPrecipitacao() {
        return this.precipitacao;
    }
    
}