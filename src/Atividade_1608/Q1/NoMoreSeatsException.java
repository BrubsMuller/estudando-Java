package Atividade_1608.Q1;

public class NoMoreSeatsException extends RuntimeException {

    public NoMoreSeatsException() {
    }

    public NoMoreSeatsException(String message) {
        super(message);
    }
}