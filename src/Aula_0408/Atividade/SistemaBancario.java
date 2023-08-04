package Aula_0408.Atividade;

// Crie um programa em Java que simule um sistema bancário básico. O sistema deve ter as seguintes classes: Conta, Cliente e Banco.
// Classe Cliente: Atributos: nome, idade e CPF. Métodos: getters e setters para os atributos.
// Classe Conta: Atributos: número da conta, saldo e cliente (representado por um objeto da classe Cliente). Métodos: getters e setters para os atributos, além de um método depositar(double valor) que adiciona o valor ao saldo da conta, e um método sacar(double valor) que realiza um saque, desde que o saldo seja suficiente.
// Classe Banco: Atributo: uma lista de contas (deve ser um ArrayList). Métodos: criarConta(Cliente cliente), que cria uma nova conta para o cliente informado e a adiciona à lista de contas do banco; buscarConta(int numeroConta), que retorna a conta correspondente ao número informado; listarContas(), que exibe as informações de todas as contas do banco.
// Crie uma classe Main para testar o sistema, onde você deve criar clientes, criar contas para esses clientes e realizar algumas operações de depósito e saque.

public class SistemaBancario {

    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabriel", 21, "456.164.779.43");
        Cliente cliente2 = new Cliente("Bruna", 28, "456.178.779.43");
        Cliente cliente3 = new Cliente("Neuza", 31, "456.164.647.43");
        Cliente cliente4 = new Cliente("Lais", 27, "249.164.779.43");

        Banco banco = new Banco();

        banco.criarConta(cliente1);
        banco.criarConta(cliente2);
        banco.criarConta(cliente3);

        banco.buscarConta(3).depositar(15000.0);
        banco.buscarConta(2).sacar(450.0);

        banco.buscarConta(2).depositar(3000.0);
        banco.buscarConta(2).sacar(150.0);
        banco.buscarConta(2).sacar(350.0);

        banco.listarContas();
    }
}
