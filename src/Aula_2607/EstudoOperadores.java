package Aula_2607;

public class EstudoOperadores {
    public static void main(String[] args) {
        // Operadores matemáticos
        int a = 10;
        int b = 15;
        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        double  divisao = b / a;  // divisão entre dois inteiros -> Somente se não der result quebrado, tem que ser inteiro

        System.out.println(soma);
        System.out.println(subtracao);
        System.out.println(multiplicacao);

        // Fazendo a divisão de modo adequado:
        int c = 10;
        double d = 15.0;
        double divisao2 = d / c;
        // divisao entre int e double => double
        System.out.println("Divisão entre double: " + divisao2);

        // Math
        double x = Math.pow(2, 3); // Para calcular uma potência -> 2 elevado a 3(elevantdo uma base ao expoente)
        double y = Math.sqrt(144); // Para calcular a raiz quadrada de um número.  -> Raiz quadrada de 144.

        System.out.println(Math.PI); // numero PI.

         // Incremento/Decremento
        int valor = 5;
        valor++; // valor = valor + 1
        ++valor;
        --valor;
        valor--; // valor = valor - 1
        valor += 10; // valor = valor + 10

        // Operadores relacionais (>, <, >=, <=, ==, !=)
        boolean teste1 = 10 > 5; // true
        boolean teste2 = 5 < 1; // false
        boolean teste3 = 5 == 5; // true
        boolean teste4 = 4 != 5; // true
        boolean teste5 = 5 >= 5; // true
        boolean teste6 = 6 <= 8;// true

        // Operadores lógicos (&&, ||, !)
        boolean teste7 = true && false; // false pois um dos lados é true
        boolean teste8 = true || false; // true pois um dos lados é true
        boolean teste9 =  (5 > 10) && (8 > 4); // false
        boolean teste10 = (10 >= 0) || (1 < 5); // true
        boolean teste11 = !teste1;

        // Exercicio
        // Crie duas variáveis: peso e altura.
        //  Calucule o IMC = peso / (altura * altura)
        // Mostre na tela o IMC.

        double peso = 75.5;
        double altura = 1.68;
        double IMC = peso / (altura * altura); // outro modo é peso / Math.pow(altura, 2)
        System.out.println("O IMC é igual a: " + IMC);
    }
}
