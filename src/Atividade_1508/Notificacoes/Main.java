package Atividade_1508.Notificacoes;

public class Main {

    public static void main(String[] args) {

        Notificavel email = new EmailNotificacao("x@email", "y@email", "olá");
        Notificavel sms = new SmsNotificacao("13254863", "458963", "Fala mesmo!");
        email.notificar();
        sms.notificar();
    }
}
