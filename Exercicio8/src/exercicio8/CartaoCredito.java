
package exercicio8;

class CartaoCredito extends Pagamento {
    private String numeroCartao;

    public CartaoCredito(double valor, String data, String descricao, String numeroCartao) {
        super(valor, data, descricao);
        this.numeroCartao = numeroCartao;
    }

    public String getNumeroCartao() { return numeroCartao; }
    public void setNumeroCartao(String numeroCartao) { this.numeroCartao = numeroCartao; }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " no crédito. Cartão: " + numeroCartao);
    }
}
