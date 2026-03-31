import java.util.Objects;

public class Processo {
    public int id;
    public String descricao;

    public Processo(int id, String descricao) {
        this.id = id;
        this.descricao = descricao;
    }

    // "Chave primária": considera dois processos iguais se tiverem o mesmo id
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Processo processo = (Processo) obj;
        return id == processo.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Processo{ID=" + id + ", descricao='" + descricao + "'}";
    }
}