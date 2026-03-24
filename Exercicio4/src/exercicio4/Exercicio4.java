
package exercicio4;


public class Exercicio4 {

    public static void main(String[] args) {
        
        Cliente cliente = new Cliente("João", "123.456.789-00");

        ContaBancaria c1 = new ContaCorrente("001", 2000, cliente);
        ContaBancaria c2 = new ContaPoupanca("002", 1500, cliente);
        ContaBancaria c3 = new ContaSalario("003", 1200, cliente);

        c1.depositar(500);
        c1.sacar(300);
        c1.consultarSaldo();

        c2.depositar(200);
        c2.sacar(100);
        ((ContaPoupanca) c2).renderJuros();
        c2.consultarSaldo();

        c3.depositar(300);
        c3.sacar(1100);
        c3.consultarSaldo();
    }
    
}
