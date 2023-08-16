package Atividade_1508.Notificacoes;

public class SmsNotificacao implements Notificavel{

    private String numDest;

    private String numOrigem;

    private String mensagem;

    public SmsNotificacao(String numDest, String numOrigem, String mensagem) {
        this.numDest = numDest;
        this.numOrigem = numOrigem;
        this.mensagem = mensagem;
    }

    @Override
    public void notificar() {
        System.out.println("De: " + numOrigem + "\nPara: " + numDest + "\n" + mensagem );
    }
}
