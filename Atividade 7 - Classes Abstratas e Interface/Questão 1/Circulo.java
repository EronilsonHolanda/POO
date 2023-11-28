public class Circulo extends Figura {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getDiametro() {
        return raio * 3.14 * 2;
    }

    @Override
    public String toString() {
        return "Circulo Cor= " + getCor() + ", Raio= " + raio;
    }
}
