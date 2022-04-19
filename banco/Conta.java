
public class Conta {
    private double saldo;
    
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    
    public double getSaldo(){
        return this.saldo;
    }
    
    public void deposita(double valor){
        this.setSaldo(this.getSaldo()+valor);
    }
    
    public void ImprimeSaldo(Conta[] c){
        for (Conta x : c){
        System.out.println(x.getSaldo());
        }
    }
    
    public Conta[] calculoPorcentagem(Conta[] contas){
         for (int i = 0; i < contas.length; i++) {
            double saldo = contas[i].getSaldo();
            contas[i].deposita (saldo * 0.005);
        }
        return contas;
    }
}
