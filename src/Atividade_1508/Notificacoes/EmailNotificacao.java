package Atividade_1508.Notificacoes;

public class EmailNotificacao implements Notificavel{

    private String emailDestinatario;

    private String emailOrigem;

    private String mensagem;

    public EmailNotificacao(String emailDestinatario, String emailOrigem, String mensagem) {
        this.emailDestinatario = emailDestinatario;
        this.emailOrigem = emailOrigem;
        this.mensagem = mensagem;
    }

    @Override
    public void notificar() {
        System.out.println("De: " + emailOrigem + "\nPara: " + emailDestinatario + "\n" + mensagem );
    }
}
