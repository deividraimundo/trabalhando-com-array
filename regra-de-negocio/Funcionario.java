
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Funcionario {

    private String nome;
    private Date nascimento;
    private String cpf;
    Endereco endereco;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(String nascimento) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        Date dataConvert = formato.parse(nascimento);
        this.nascimento = dataConvert;
    }

    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String retornarMensagemComDados() {
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        return "O cliente tem nome: " + getNome() + " CPF: " + getCpf() + " data de nascimento:" + formato.format(getNascimento());
    }

    public boolean verificaCidade(String cidade) {
        if (cidade.equals("Mococa")) {
            return true;
        } else {
            return false;
        }
    }
}
