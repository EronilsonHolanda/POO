public class Quadrado extends Retangulo {
    public Quadrado(double lado) {
        super(lado, lado);
    }

    @Override
    public String toString() {
        return "Quadrado Cor= " + getCor() + ", Lado= " + getLado1();
    }
}