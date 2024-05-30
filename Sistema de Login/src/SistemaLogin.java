import javax.swing.JOptionPane;

public class SistemaLogin {
    public static void main(String[] args) {
        final String CORRECT_LOGIN = "java8";
        final String CORRECT_PASSWORD = "java8";
        int attempts = 3;

        while (attempts > 0) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String password = JOptionPane.showInputDialog("Digite a senha:");

            if (login.equals(CORRECT_LOGIN) && password.equals(CORRECT_PASSWORD)) {
                JOptionPane.showMessageDialog(null, "Acesso concedido.");
                return;
            } else {
                attempts--;
                JOptionPane.showMessageDialog(null, "Login ou senha incorretos. Tentativas restantes: " + attempts);
            }
        }

        JOptionPane.showMessageDialog(null, "Acesso bloqueado.");
    }
}
