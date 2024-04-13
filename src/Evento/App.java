package Evento;
import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {

        String nomeLocal = JOptionPane.showInputDialog("Digite o nome do local:");
        String enderecoLocal = JOptionPane.showInputDialog("Digite o endereço do local:");
        Local local = new Local(nomeLocal, enderecoLocal);

        String nomeTipoEvento = JOptionPane.showInputDialog("Digite o nome do tipo de evento:");
        TipoEvento tipoEvento = new TipoEvento(nomeTipoEvento);

        String nomeEvento = JOptionPane.showInputDialog("Digite o nome do evento:");
        Evento evento = new Evento(nomeEvento, tipoEvento, local);

        double precoIngresso = Double.parseDouble(JOptionPane.showInputDialog("Digite o preço do ingresso:"));
        int quantidadeDisponivel = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de ingressos disponíveis:"));
        LoteIngresso lote = new LoteIngresso(precoIngresso, quantidadeDisponivel);

        Ingresso ingresso = new Ingresso(evento, lote);

        String mensagem = "Dados do evento:\n"
                        + "Nome: " + evento.getNome() + "\n"
                        + "Tipo de Evento: " + evento.getTipoEvento().getNome() + "\n"
                        + "Local: " + evento.getLocal().getNome() + "\n"
                        + "Endereço: " + evento.getLocal().getEndereco() + "\n"
                        + "Preço do Ingresso: R$ " + ingresso.getLote().getPreco() + "\n"
                        + "Quantidade de Ingressos Disponíveis: " + ingresso.getLote().getQuantidadeDisponivel();
        
        JOptionPane.showMessageDialog(null, mensagem);
    
    }

}