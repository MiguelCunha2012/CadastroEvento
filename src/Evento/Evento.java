package Evento;

public class Evento {
    private String nome;
    private TipoEvento tipoEvento;
    private Local local;
    // Outros atributos relevantes

    public Evento(String nome, TipoEvento tipoEvento, Local local) {
        this.nome = nome;
        this.tipoEvento = tipoEvento;
        this.local = local;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoEvento getTipoEvento() {
        return tipoEvento;
    }

    public void setTipoEvento(TipoEvento tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
}


