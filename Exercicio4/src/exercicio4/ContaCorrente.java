
package exercicio4;

class ContaCorrente extends ContaBancaria {

    public ContaCorrente(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    ContaCorrente(String string, int i, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void sacar(double valor) {
        double taxa = 2.0;
        if (getSaldo() >= (valor + taxa)) {
            setSaldo(getSaldo() - (valor + taxa));
            System.out.println("Saque com taxa realizado. Taxa: " + taxa);
        } else {
            System.out.println("Saldo insuficiente para saque com taxa.");
        }
    }
}
