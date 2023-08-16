package Aula_1608.Exceptions.Personalizadas;

public class TamanhoEmailExcedidoException extends RuntimeException {

    public TamanhoEmailExcedidoException() {
    }

    public TamanhoEmailExcedidoException(String message) {
        super(message);
    }
}
