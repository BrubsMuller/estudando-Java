package Aula_2607;

public class EstudoVariaveis {
    // variável = container de dados
    // tipagem forte = definir o tipo de cada variável
    public static void main(String[] args) {
        // para definir uma variavel:
        // <tipo> <nome> = <valor>; -> uma vez criada a variávle, não possível mais alterar O TIPO desta variáve

        // Tipos primitivos: int, long, char, boolean, double ou float (surgiram junto com a linguagem)
        // Tipos não -primitivos: String, List (foram implementados depois)

        // Como declarar variáveis?
        int estoque = 150; // até 2 bilhões
        // O L no final do número abaixo é um sufixo para representar o tipo long
        long populacaoTerra = 7900000000L; // até a  asa dos quintilhões
        double salarioDev = 5500.99; // vai até 15 casas de precisão
        // O F no final no número abaixo é um sufixo para representar o tipo float
        float nota = 7.5F; // vai até 7 casas de precisão
        boolean ativo = true; // true, false
        String nome = "Jose Almir"; // usamos aspas duplas sempre para declarar uma string
        char letra = 'A'; // char = representa um único caractere, usado entre aspas simples

        // Tipagem forte
        int a = 1000;
        a = 2000; // reatribuição/atualização de valor
        //a = "batata"; // impossível atribuir outro tipo, pois o a já está definido como tipo inteiro

        System.out.println("Estoque: " + estoque);
        System.out.println("População da Terra: " + populacaoTerra);
        System.out.println(nome);
    }
}