
package exercicio4;

class ContaSalario extends ContaBancaria {

    public ContaSalario(String numero, double saldo, Cliente titular) {
        super(numero, saldo, titular);
    }

    ContaSalario(String string, int i, Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sacar(double valor) {
        if (valor <= 1000 && getSaldo() >= valor) {
            setSaldo(getSaldo() - valor);
            System.out.println("Saque permitido (conta salário).");
        } else {
            System.out.println("Saque não permitido ou saldo insuficiente.");
        }
    }
}