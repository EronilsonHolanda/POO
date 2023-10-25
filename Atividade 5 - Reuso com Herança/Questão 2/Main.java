public class Main {
    public static void main(String[] args) {
        Ingresso ingresso = new Ingresso(50.0);
        VIP vipIngresso = new VIP(100.0, 20.0);
        Normal normalIngresso = new Normal(75.0);
        CamaroteInferior camaroteInferior = new CamaroteInferior(150.0, 30.0, "Setor A");
        CamaroteSuperior camaroteSuperior = new CamaroteSuperior(200.0, 40.0);

        ingresso.imprimirValor();
        vipIngresso.imprimirValor();
        System.out.println("Valor do Ingresso VIP: R$" + vipIngresso.getValorVIP());
        normalIngresso.imprimirValor();
        normalIngresso.imprimeTipo();
        camaroteInferior.imprimirValor();
        System.out.println("Valor do Camarote Inferior VIP: R$" + camaroteInferior.getValorVIP());
        camaroteInferior.imprimeLocalizacao();
        camaroteSuperior.imprimirValor();
        System.out.println("Valor do Camarote Superior VIP: R$" + camaroteSuperior.getValorVIP());
    }
}