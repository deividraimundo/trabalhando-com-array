
import java.text.ParseException;
import javax.swing.JOptionPane;

public class Principal {

    public static void main(String[] args) throws ParseException {

        Funcionario[] arrayFuncionario = new Funcionario[3];

        for (int i = 0; i < 3; i++) {

            Funcionario f = new Funcionario();
            Endereco e = new Endereco();

            e.setBairro("Vila");
            e.setRua("Amazonas");
            e.setNumero(500);
            e.setCep("456");
            e.setCidade("Mococa");

            f.setNome("Deivid");
            f.setCpf("123");
            f.setNascimento("20/12/2000");

            f.setEndereco(e);

            arrayFuncionario[i] = f;
        }

        String todosFuncionarios = "";
        for (int i = 0; i < arrayFuncionario.length; i++) {

            Funcionario f = arrayFuncionario[i];
            todosFuncionarios += f.retornarMensagemComDados() + "\n" + f.getEndereco().endereco() + "\n";
            JOptionPane.showMessageDialog(null, todosFuncionarios);
        }

    }

}
