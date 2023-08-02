package Aula_0208;

// POO (Programação Orientada à Objetos)
// Classes -> Fruta (Modelagem)
// Objetos -> Maça, Pera, Banana, Goiaba
// Instancias -> Processo que constroi um objeto a partir de uma classe
// Atributo/Propriedade -> Um valor definido na classe incorporado no objeto
//

public class EstudoClasses {

    public static void main(String[] args) {
        Fruta maca = new Fruta(); // criar/instancia um objeto
        maca.nome = "Maça";
        maca.cor = "Vermelha";
        maca.acidez = 7;
        maca.suculencia = true;
    }

}
