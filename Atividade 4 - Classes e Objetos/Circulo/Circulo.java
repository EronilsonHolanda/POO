package Circulo;

import java.lang.Math;

class Circulo {
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

    public double getArea() {
        return Math.PI * Math.pow(raio, 2);
    }

    public double getCircunferencia() {
        return 2 * Math.PI * raio;
    }

    public void aumentarRaio(double percentual) {
        if (percentual > 0) {
            raio *= (1 + percentual / 100);
        }
    }
}
