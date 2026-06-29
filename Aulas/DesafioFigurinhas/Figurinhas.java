package Aulas.DesafioFigurinhas;

public class Figurinhas implements Comparable<Figurinhas> {
    private String nomeSelecao;
    private int numeroFigura;
    private String descricao;
    private int quantidade;
    private boolean raridade;

    public Figurinhas(String nomeSelecao, int numeroFigura, String descricao, int quantidade, boolean raridade) {
        this.descricao = descricao;
        this.numeroFigura = numeroFigura;
        this.nomeSelecao = nomeSelecao;
        this.quantidade = quantidade;
        this.raridade = raridade;
    }

    @Override
    public int compareTo(Figurinhas segunda) {
        //método legal pra fazer o posicionamento das seleções, retorna um número negativo se a seleção vem antes, 0 se é igual e um positivo se vem depois, alfabeticamente
        int comparacaoSelecao = this.nomeSelecao.compareTo(segunda.nomeSelecao);

        // Se as seleções forem diferentes
        if (comparacaoSelecao != 0) {
            return comparacaoSelecao;
        }

        // desempata pelo número
        return Integer.compare(this.numeroFigura, segunda.numeroFigura);
    }

    @Override
    public String toString() {
        return "Selc:" + nomeSelecao +
                " |Núm:" + numeroFigura +
                " |Desc:" + descricao +
                " |Qtd:" + quantidade +
                " |Rara:" + raridade;
    }

    @Override
    public boolean equals(Object obj) { // reescrevemos o método equals para definir os atributos identificadores
        Figurinhas figurinhas =(Figurinhas)obj; // Transformamos o OBJ em "Figurinhas" , (cast), converter o objeto generio para esse especifico e tornar os dados mais fáceis de acessar
        return (this.numeroFigura == figurinhas.numeroFigura) && this.nomeSelecao.equalsIgnoreCase(figurinhas.nomeSelecao); // se dois registros tiverem o mesmo numero e a mesma seleção eles são considerados iguais

      
    }
    

    public String getNomeSelecao() {
        return nomeSelecao;
    }

    public void setNomeSelecao(String nomeSelecao) {
        this.nomeSelecao = nomeSelecao;
    }

    public int getNumeroFigura() {
        return numeroFigura;
    }

    public void setNumeroFigura(int numeroFigura) {
        this.numeroFigura = numeroFigura;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isRaridade() {
        return raridade;
    }

    public void setRaridade(boolean raridade) {
        this.raridade = raridade;
    }
}
