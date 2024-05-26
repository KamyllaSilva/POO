import javax.swing.JOptionPane;

public class CalculadoraITBI {
    public static void main(String[] args) {
        String valorTransacaoStr = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        double valorTransacao = Double.parseDouble(valorTransacaoStr);

        String valorVenalStr = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        double valorVenal = Double.parseDouble(valorVenalStr);

        String porcentagemImpostoStr = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI:");
        double porcentagemImposto = Double.parseDouble(porcentagemImpostoStr);

        double maiorValor = Math.max(valorTransacao, valorVenal);
        double valorImposto = (maiorValor * porcentagemImposto) / 100;

        JOptionPane.showMessageDialog(null, String.format("Valor do imposto ITBI: %.2f", valorImposto));
    }
}
