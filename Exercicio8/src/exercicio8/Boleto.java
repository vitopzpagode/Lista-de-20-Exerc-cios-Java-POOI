
package exercicio8;

class Boleto extends Pagamento {
    private String codigoBarras;

    public Boleto(double valor, String data, String descricao, String codigoBarras) {
        super(valor, data, descricao);
        this.codigoBarras = codigoBarras;
    }

    public String getCodigoBarras() { return codigoBarras; }
    public void setCodigoBarras(String codigoBarras) { this.codigoBarras = codigoBarras; }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " via boleto. Código: " + codigoBarras);
    }
}
