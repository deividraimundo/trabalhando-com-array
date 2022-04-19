
public class Endereco {

    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String cidade;

    public String getRua() {
        return this.rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return this.numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return this.bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return this.cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCidade() {
        return this.cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String endereco() {
        return "Rua: " + getRua() + "Número: " + getNumero() + "Bairro: " + getBairro() + "Cep: " + getCep() + "Cidade: " + getCidade();
    }

   
}
