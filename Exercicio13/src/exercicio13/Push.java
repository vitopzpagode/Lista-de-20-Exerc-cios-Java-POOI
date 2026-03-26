
package exercicio13;

class Push extends Notificacao {

    public Push(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Notificação push enviada para " + getDestinatario() + ": " + getMensagem());
    }
}
