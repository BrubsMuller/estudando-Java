public class SaidaDeDados {
   public static void main(String[] args) {
        System.out.println("Hello, World");
        System.out.print(1); // Não quebra a linha
        System.out.print(2);
        System.out.println(); // quebra de linha se os parênteses etiverem vazio
        System.out.println("Oi\nEu sou Java!");
        System.err.println("Ops! Houve um erro"); // serr -> impressão de erro. Aparece a frase em vermelho

       int n1 = 7;
       int n2 = 9;
       int soma = n1 + n2;

       System.out.printf("A soma de %d e %d é igual a %d.\n", n1, n2, soma);
       // %d -> mapeia um número

       String nome = "Matheus";
       System.out.printf("Bem vindo, %s!\n", nome);
       // %s-> mapeia um texto

       double nu1 = 3.4;
       double nu2 = 12.5;
       double div = nu2 / nu1;
       System.out.printf("A divisão de %.2f e %.2f é igual a %.3f.\n", nu1, nu2, div);
       // %f -> mapeia um número flutuante
   }
}
