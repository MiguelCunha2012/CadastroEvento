package Evento;

public class LoteIngresso {
        private double preco;
        private int quantidadeDisponivel;
    
        public LoteIngresso(double preco, int quantidadeDisponivel) {
            this.preco = preco;
            this.quantidadeDisponivel = quantidadeDisponivel;
        }
    
        public double getPreco() {
            return preco;
        }
    
        public void setPreco(double preco) {
            this.preco = preco;
        }
    
        public int getQuantidadeDisponivel() {
            return quantidadeDisponivel;
        }
    
        public void setQuantidadeDisponivel(int quantidadeDisponivel) {
            this.quantidadeDisponivel = quantidadeDisponivel;
        }
    }
    
    class Ingresso {
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

