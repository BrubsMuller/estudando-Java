package Aula_1508.heranca;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        Produto batata = new Produto("Batata", 8.5F, "1579566");
        System.out.println(batata.getCodigo());
        System.out.println(batata.getNome());
        System.out.println(batata.getPreco());


        Livro cleanCode = new Livro("Clean Code", 100.0F, "9874564", 300, "123.123.123.123");
        System.out.println(cleanCode.getCodigo());
        System.out.println(cleanCode.getNome());
        System.out.println(cleanCode.getPreco());
        System.out.println(cleanCode.getNumPaginas());
        System.out.println(cleanCode.getIsbn());

        Comida comida = new Comida("Tapioca", 5.0F, "459876", LocalDate.of(2023,9,30), 130.0F);
        System.out.println(comida.getNome());
        System.out.println(comida.getPrazoDeValidade());

        Carne gado = new Carne("Picanha", 100.0F, "4578236", LocalDate.of(2023, 12, 8), 200.0F, "Bovina");
        System.out.println(gado.getNome());
        System.out.println(gado.getCategoria());
        System.out.println(gado.getCaloria());
    }
}
