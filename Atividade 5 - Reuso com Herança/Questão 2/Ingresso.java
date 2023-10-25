public class Ingresso {
    public double valor;

    public Ingresso(double valor){
        this.valor = valor;
    }
    
    public void imprimirValor(){
        System.out.println("Valor do Ingresso: R$" + valor);
    }

    public double getValor() {
        return valor;
    }   
}