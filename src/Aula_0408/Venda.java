package Aula_0408;

import java.time.LocalDate;
import java.util.List;

public class Venda {
    private LocalDate dataRegistro;
    private String cliente;
    private List<String> produtos;

    private Double precoTotal;

    public Venda() { }

    public Venda(LocalDate dataRegistro) {
        setDataRegistro(dataRegistro);
    }
    public Venda(String cliente) {
        setCliente(cliente);
    }

    public Venda(String cliente, LocalDate dataRegistro) {
        setCliente(cliente);
        setDataRegistro(dataRegistro);
    }

    public Venda(LocalDate dataRegistro, String cliente, List<String> produtos, Double precoTotal) {
        this.dataRegistro = dataRegistro;
        this.cliente = cliente;
        this.produtos = produtos;
        this.precoTotal = precoTotal;
        // Abaixo, outra maneira de definir o construtor, sem usa o .this
        //setDataRegistro(dataRegistro);
        //setCliente(cliente);
        //setProdutos(produtos);
        //setPrecoTotal(precoTotal);
    }

    public LocalDate getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(LocalDate dataRegistro) {
        this.dataRegistro = dataRegistro;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<String> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<String> produtos) {
        this.produtos = produtos;
    }

    public Double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(Double precoTotal) {
        this.precoTotal = precoTotal;
    }

    @Override // annotation (anotação) -> indica uma sobrescrita de método
    public String toString() { // toda classe tem esse método toString, que é um método para como eu quero que saia esta impressão.
        return "Venda{" +
                "dataRegistro=" + dataRegistro +
                ", cliente='" + cliente + '\'' +
                ", produtos=" + produtos +
                ", precoTotal=" + precoTotal +
                '}';
    }
    // Object -> é uma classe que representa todos os objetos do Java
}
