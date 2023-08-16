package Aula_1608.Interfaces;

public class Main {

    public static void mostrarAreaForma(Forma forma){
        System.out.println("Area " + forma.calcularArea());
        System.out.println("Perimetro " + forma.calcularPerm());
    }
    public static void main(String[] args) {

        Quadrado quadrado = new Quadrado(6);
        Triangulo triangulo = new Triangulo(8, 6);
        Forma circulo = new Circulo(4);

        mostrarAreaForma(quadrado);
        mostrarAreaForma(triangulo);
        mostrarAreaForma(circulo);

    }
}

// Encapsulamento -> Uso de moficidores para "esconder"
// Herança -> Capacidade de uma classe de herdar os atributos e métodos e de outra classe
// Polimorfismo -> Classes que podem assumir diversas formas
// Abstração -> Classes abstratas e interfaces