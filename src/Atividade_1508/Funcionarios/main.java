package Atividade_1508.Funcionarios;

public class main {

    public static void main(String[] args) {

        Funcionario func1 = new Desenvolvedor("José Almir", "Desenvolvedor", "123456");
        Funcionario func2 = new Atendente("Gabriel Fontes", "Atendente", "456779");
        Funcionario func3 = new Gerente("Victor Icoma", "Gerente", "7855933");

        System.out.println(func1.getNome());
        System.out.println(func2.getNome());
        System.out.println(func3.getNome());

    }
}
