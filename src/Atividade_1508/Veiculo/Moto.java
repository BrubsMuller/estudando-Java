package Atividade_1508.Veiculo;

public class Moto extends Veiculo {

    private Integer cilindradas;

    public Moto() {
    }

    public Moto(String marca, String modelo, Integer ano, Integer cilindradas) {
        super(marca, modelo, ano);
        this.cilindradas = cilindradas;
    }

    public Integer getCilindradas() {
        return cilindradas;
    }

    public void setCilindradas(Integer cilindradas) {
        this.cilindradas = cilindradas;
    }
}
