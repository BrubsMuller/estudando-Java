package Aula_0308;

public class EstudoModificadores {
    // Modificadores
    // - Acesso:
    //      -> public: (Pode-se acessar for a da classe e fora do pacote que ele foi definido)
    //      -> private: (Não se pode acessar fora da classe, somente dentro da própria classe)
    //      -> protected: (acessado por classes no mesmo pacote pela própria classe ou por seus filhos)
    //      -> default: (padrão) acessado somente por classes no mesmo pacote.
    // - Não acesso
    //      -> static: (membro da classe)
    //      -> final: (criar uma constante)
    //   Encapsulamento -> Garantir a consistência dos dados de uma classe.

        public final double PI = 3.1415;
        // constante devem ser estar com todos os caracteres e caixa alta.

        public static void main(String[] args) {
            // Cliente.validarEmail("gabriel@mail.com");

            Cliente maria = new Cliente("Maria", 25, 1.70);
            maria.setNome("Maria");
            System.out.println(maria.getNome());
            System.out.println(maria.getIdade());
            System.out.println(maria.getDataNascimento());
            System.out.println(maria.getAltura());
            System.out.println(maria.getCpf());
            System.out.println(maria.getEmail());
            System.out.println(maria.getCpf());
            Cliente joao = new Cliente("João", 21, 1.65);
            joao.setEmail("joao@gmail.com");
        }
}
