
package exercicio6;

class Roupa extends Produto {
    private String tamanho;

    public Roupa(String nome, double preco, int quantidade, String tamanho) {
        super(nome, preco, quantidade);
        this.tamanho = tamanho;
    }

    public String getTamanho() { return tamanho; }
    public void setTamanho(String tamanho) { this.tamanho = tamanho; }

    @Override
    public double calcularPrecoFinal() {
        double total = getPreco() * getQuantidade();
        if (getQuantidade() > 3) {
            return total * 0.85; // desconto por quantidade
        }
        return total;
    }
}
