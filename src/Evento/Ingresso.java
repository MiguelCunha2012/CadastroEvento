package Evento;

public class Ingresso {
    private Evento evento;
    private LoteIngresso lote;

    public Ingresso(Evento evento, LoteIngresso lote) {
        this.evento = evento;
        this.lote = lote;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public LoteIngresso getLote() {
        return lote;
    }

    public void setLote(LoteIngresso lote) {
        this.lote = lote;
    }
}

