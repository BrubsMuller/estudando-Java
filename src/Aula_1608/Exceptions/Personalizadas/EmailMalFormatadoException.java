package Aula_1608.Exceptions.Personalizadas;

public class EmailMalFormatadoException extends RuntimeException {

    public EmailMalFormatadoException() {
    }

    public EmailMalFormatadoException(String message) {
        super(message);
    }
}
