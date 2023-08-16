package Atividade_1508.Veiculo;

import java.time.LocalDate;

//Crie uma classe Veiculo com propriedades como marca, modelo e ano. Em seguida, crie subclasses como Carro e Moto que herdam de Veiculo.
public class Veiculo {

    private String marca;
    private String modelo;
    private Integer ano;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, Integer ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {

        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
}


