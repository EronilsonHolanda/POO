public class VIP extends Ingresso {
    public double valorAdicional;
    public VIP(double valor, double valorAdicional){
        super(valor);
        this.valorAdicional = valorAdicional;
    }

    public double getValorVIP() {
        return super.getValor() + valorAdicional;
    }
    
}
