
package exercicio8;

public class Exercicio8 {

    public static void main(String[] args) {
         Pagamento p1 = new CartaoCredito(150.0, "24/03/2026", "Compra online", "1234-5678-9999");
        Pagamento p2 = new Pix(80.0, "24/03/2026", "Pagamento rápido", "email@pix.com");
        Pagamento p3 = new Boleto(200.0, "24/03/2026", "Conta de luz", "123456789000");
        Pagamento p4 = new Dinheiro(50.0, "24/03/2026", "Compra local");

        p1.processarPagamento();
        p2.processarPagamento();
        p3.processarPagamento();
        p4.processarPagamento();
    }
    
}
