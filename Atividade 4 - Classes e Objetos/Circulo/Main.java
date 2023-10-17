package Circulo;

public class Main {
    public static void main(String[] args) {
        double raio = 5.0; // Defina o raio desejado aqui
        Circulo circulo = new Circulo(raio);

        System.out.println("Raio do círculo: " + circulo.getRaio());
        System.out.println("Área do círculo: " + circulo.getArea());
        System.out.println("Circunferência do círculo: " + circulo.getCircunferencia());

        double percentualAumento = 10.0; // Defina o percentual de aumento desejado aqui
        circulo.aumentarRaio(percentualAumento);

        System.out.println("Novo raio do círculo após aumento: " + circulo.getRaio());
        System.out.println("Nova área do círculo após aumento: " + circulo.getArea());
        System.out.println("Nova circunferência do círculo após aumento: " + circulo.getCircunferencia());
    }
}
