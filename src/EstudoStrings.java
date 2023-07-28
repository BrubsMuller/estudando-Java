import java.util.Scanner;

public class EstudoStrings {

    public static void main(String[] args) {
        // String java = "Java"; // um texto é um objeto
        // System.out.println(java.toLowerCase()); // minuscula
        // System.out.println(java.toUpperCase()); // maiuscula
        // System.out.println(java.charAt(3)); // carctere com base na sua posição
        // System.out.println(java.indexOf("va")); // indice do primeiro caractere da substring
        // System.out.println(java.replace("v", "c")); // substituir o v por c
        // System.out.println(java.replaceAll("a", "i")); // substituir o a por i en todos as A's
        // System.out.println(java.substring(2, 4)); // indice inicial, indice final + 1
        // System.out.println(java.length()); // tamanho do texto


        // String nome1 = "Estefane";
        // String nome2 = "EsteFane";
        // System.out.println(nome1 == nome2); // compara os obejtos nome1 e nome2
        // System.out.println(nome1.equals(nome2)); // compara os textos das duas variáveis
        // para comparar os textos (contetudo do objeto string) em Java utiliza-se SEMPRE o .equals
        // System.out.println(nome1.equalsIgnoreCase(nome2)); // aqui, vai ignorar o fato de ter um F maisuculo no nome
        // System.out.println("texto".equals("texto2") && "texto2".equals("texto3"));

        Scanner scanner= new Scanner (System.in);

        String texto = "Vamos para o break retornamos as 10:35.";
        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine();

        if(palavra.isEmpty()) {
            System.out.println("Conteúdo vazio");
        }
        else if(texto.contains(palavra)) {
            System.out.println("contem)");
        }
        else {
            System.out.println("Não contém.");
        }

        // System.out.println(" ".isEmpty()); // false
        // System.out.println(" ".isBlank()); // true (considera os espaços)



    }
}
