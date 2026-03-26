
package exercicio13;

class Email extends Notificacao {

    public Email(String destinatario, String mensagem, String data) {
        super(destinatario, mensagem, data);
    }

    @Override
    public void enviar() {
        System.out.println("Email enviado para " + getDestinatario() + ": " + getMensagem());
    }
}
