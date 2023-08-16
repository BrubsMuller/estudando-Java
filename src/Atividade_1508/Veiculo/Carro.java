package Atividade_1508.Veiculo;

public class Carro extends Veiculo {

    private String categoria;

    public Carro() {
    }

    public Carro(String marca, String modelo, Integer ano, String categoria) {
        super(marca, modelo, ano);
        this.categoria = categoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
