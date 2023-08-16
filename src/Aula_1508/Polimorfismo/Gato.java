package Aula_1508.Polimorfismo;

public class Gato extends Animal {

    private String corPelo;

    public String getCorPelo() {
        return corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    //  sobreposição de métodos -> reescrever um método
    @Override // -> Anotação
    public void emitirSom() {
        System.out.println("miau, miau!");
    }
}
