package Atividade_1608.Q2;

public class MoedaDesconhecidaException extends RuntimeException {

    public MoedaDesconhecidaException() {
    }

    public MoedaDesconhecidaException(String message) {
        super(message);
    }
}
