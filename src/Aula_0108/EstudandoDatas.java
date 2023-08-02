package Aula_0108;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class EstudandoDatas {

    public static void main(String[] args) {

        LocalDate hoje = LocalDate.now();
        System.out.println(hoje);

        LocalTime agora = LocalTime.now();
        System.out.println(agora);

        LocalDateTime dataHoraAtual = LocalDateTime.now();
        System.out.println(dataHoraAtual);
        System.out.println("Ano" + dataHoraAtual.getYear());
        System.out.println("Mês" + dataHoraAtual.getMonthValue());
        System.out.println("Dia" + dataHoraAtual.getDayOfMonth());
        System.out.println(dataHoraAtual.getDayOfWeek());

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String dataHoraAtualFormatada = dataHoraAtual.format(formatoBr);
        System.out.println("Data formatada "+ dataHoraAtualFormatada);

        int ano = 2023;
        int mes = 12;
        int dia = 7;
        LocalDate dataValida = LocalDate.of(ano, mes, dia);
        System.out.println(dataValida);

        // LocalDate data1 = LocalDate.now(); //hoje
        LocalDate data = LocalDate.of(2023,8, 2);
        if(hoje.isAfter(data)) {
            System.out.println("A data "+data+" já passou!");
        }
        else {
            System.out.println("A data "+data+" ainda não passou.");
        }

        hoje.isAfter(data); // verifica se hoje já passou da data
        hoje.isBefore(data); // verifica se hoje ainda não passou de data

    }
}
