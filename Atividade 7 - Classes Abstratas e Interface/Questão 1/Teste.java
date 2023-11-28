public class Teste {
    public static void main(String[] args) {
        Retangulo retangulo = new Retangulo(4, 5);
        retangulo.setCor("Azul");

        Triangulo triangulo = new Triangulo(3, 6);
        triangulo.setCor("Verde");

        Circulo circulo = new Circulo(2.5);
        circulo.setCor("Vermelho");

        Quadrado quadrado = new Quadrado(4);
        quadrado.setCor("Amarelo");

        System.out.println(retangulo.toString());
        System.out.println("Area do retângulo: " + retangulo.area());
        System.out.println("----------------------------------------");

        System.out.println(triangulo.toString());
        System.out.println("Area do triângulo: " + triangulo.area());
        System.out.println("----------------------------------------");

        System.out.println(circulo.toString());
        System.out.println("Diâmetro do círculo: " + circulo.getDiametro());
        System.out.println("----------------------------------------");

        System.out.println(quadrado.toString());
        System.out.println("Area do quadrado: " + quadrado.area());
    }
}