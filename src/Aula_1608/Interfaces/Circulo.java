package Aula_1608.Interfaces;

public class Circulo implements Forma {

    private double raio;

    public Circulo() {
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return 0;
    }

    @Override
    public double calcularPerm() {
        return 0;
    }
}
