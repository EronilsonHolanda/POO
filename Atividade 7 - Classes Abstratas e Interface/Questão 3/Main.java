public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente(1000);
        ContaPoupanca contaPoupanca = new ContaPoupanca(500);
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        contaCorrente.deposita(200);
        contaCorrente.saca(50);
        System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());

        contaPoupanca.deposita(100);
        contaPoupanca.saca(30);
        System.out.println("Saldo da Conta Poupança: " + contaPoupanca.getSaldo());

        System.out.println("Tributos da Conta Corrente: " + contaCorrente.calculaTributos());
        System.out.println("Tributos do Seguro de Vida: " + seguroDeVida.calculaTributos());
    }
}