
package exercicio13;


public class Exercicio13 {

    public static void main(String[] args) {
          Notificacao n1 = new Email("email@email.com", "Olá por email!", "26/03/2026");
        Notificacao n2 = new SMS("51999999999", "Olá por SMS!", "26/03/2026");
        Notificacao n3 = new WhatsApp("51988888888", "Olá no Whats!", "26/03/2026");
        Notificacao n4 = new Push("Usuário App", "Você tem uma nova notificação!", "26/03/2026");

        n1.enviar();
        n2.enviar();
        n3.enviar();
        n4.enviar();
    }
    
}
