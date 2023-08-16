package Atividade_1508.Veiculo;

// Crie uma classe Veiculo com propriedades como marca, modelo e ano. Em seguida, crie subclasses como Carro e Moto que herdam de Veiculo.
// Implemente um sistema de pagamento com diferentes métodos (CartaoCredito, PayPal, BoletoBancario) que possam ser usados de forma polimórfica.
// Desenvolva um sistema de notificações que use abstração como Notificavel e tenha classes concretas como EmailNotificacao e SMSNotificacao.
// Crie uma hierarquia de funcionários, onde temos uma classe base Funcionario e subclasses como Gerente, Desenvolvedor e Atendente.
public class Main {

    public static void main(String[] args) {


        Carro carro = new Carro("Honda", "Civic", 2021, "Sedan");
        System.out.println(carro.getCategoria());

        Moto moto = new Moto("Honda", "XTR", 2011, 250 );
        System.out.println(moto.getModelo());
        System.out.println(moto.getMarca());
        System.out.println(moto.getCilindradas());

        Moto moto1 = new Moto();
        moto1.setMarca("BMW");
        System.out.println(moto1.getMarca());
    }





}

