package Atividade_1508.Pagamentos;

import java.time.LocalDate;

public class main {
    public static void main(String[] args) {

        LocalDate data1 = LocalDate.of(2023, 8, 10);
        LocalDate data2 = LocalDate.of(2023, 7, 23);
        LocalDate data3 = LocalDate.of(2023, 7, 18);

        Pagamento pagamento1 = new BoletoBancario(10.0, data1, "4587896621335444");
        Pagamento pagamento2 = new PayPal(4000.0, data2, "muller@email.com", 2.0F);
        Pagamento pagamento3 = new CartaoCredito(200.0, data3, 12905.0, 3000.0, "MasterCard");

        System.out.println(pagamento1.getValor());
        System.out.println(pagamento1.getData());

        System.out.println(pagamento2.getValor());
        System.out.println(pagamento2.getData());

        System.out.println(pagamento3.getValor());
        System.out.println(pagamento3.getData());

    }
}
