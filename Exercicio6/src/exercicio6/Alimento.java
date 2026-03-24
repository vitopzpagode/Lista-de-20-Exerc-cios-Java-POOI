
package exercicio6;

class Alimento extends Produto {
    private String validade;

    public Alimento(String nome, double preco, int quantidade, String validade) {
        super(nome, preco, quantidade);
        this.validade = validade;
    }

    public String getValidade() { return validade; }
    public void setValidade(String validade) { this.validade = validade; }

    @Override
    public double calcularPrecoFinal() {
        double total = getPreco() * getQuantidade();
        return total * 0.95; // 5% de desconto
    }
}
