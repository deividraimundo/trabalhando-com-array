
import javax.swing.JOptionPane;


public class Banco {
    public static void main(String[] args) {
        Conta[] contas = new Conta[10];
        Conta c = null;
        
        for (int i = 0; i < contas.length; i++) {
            c = new Conta();
            double saldo = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da conta "+(i+1)));
            c.setSaldo(saldo);
            contas[i] = c;
        }
        contas = c.calculoPorcentagem(contas);
        c = new Conta();
        c.ImprimeSaldo(contas);
    }
    
}
