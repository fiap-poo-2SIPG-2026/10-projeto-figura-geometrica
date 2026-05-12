package br.techgeo.figura;

import br.techgeo.ponto.Ponto;

public class Circulo extends Figura {
    private Ponto ponto;
    private double raio;

    public Circulo(Ponto ponto, double raio) {
        this.ponto = ponto;
        this.raio = raio;
    }

    public double calcularArea() {
        double area;
        area = Math.PI * Math.pow(raio, 2);
        return area;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    public Ponto getPonto() {
        return ponto;
    }

    public void setPonto(Ponto ponto) {
        this.ponto = ponto;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }
}
