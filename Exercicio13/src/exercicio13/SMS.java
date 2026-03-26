
package exercicio13;

class SMS extends Notificacao {

    public SMS(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("SMS enviado para " + getDestinatario() + ": " + getMensagem());
    }
}
