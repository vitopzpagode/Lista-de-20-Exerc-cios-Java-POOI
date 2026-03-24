
package exercicio4;

class ContaPoupanca extends ContaBancaria {

    public ContaPoupanca(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    ContaPoupanca(String string, int i, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void renderJuros() {
        double rendimento = getSaldo() * 0.05;
        setSaldo(getSaldo() + rendimento);
        System.out.println("Rendimento aplicado: " + rendimento);
    }

    @Override
    public void sacar(double valor) {
        super.sacar(valor);
    }
}
