package Aula_1508.Polimorfismo;

public class Main {
    public static void main(String[] args) {
        // classe Aimal é abstrata portanto, não pode ser instanciada
       // Animal rato  = new Animal("Rato", "Mus musculos", "Terrenos Baldios");
        //System.out.println(rato.getNome());
        //System.out.println(rato.getEspecie());
        //System.out.println(rato.getHabitat());

        Gato gato0 = new Gato();
        Animal gato = new Gato();
        Animal cachorro = new Cachorro();

        gato.emitirSom();
        cachorro.emitirSom();

        gato0.setCorPelo("Marrom");
        System.out.println(gato0.getCorPelo());
        //gato.setCorPelo("Pedreis"); Invalido
        //System.out.println(gato.getCorPelo()); Invalido




    }

}
