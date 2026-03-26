
package exercicio13;

class WhatsApp extends Notificacao {

    public WhatsApp(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Mensagem via WhatsApp para " + getDestinatario() + ": " + getMensagem());
    }
}
