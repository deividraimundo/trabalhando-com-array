
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        int[] vetor = new int[30];
        ImprimindoArray imprimir = new ImprimindoArray();
        for (int i = 0; i < 30; i++) {
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor do vetor: "));
        }
        imprimir.imprimeArray(vetor);
        imprimir.imprimeArray2(vetor);
        
    }
    
}
