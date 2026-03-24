
package exercicio6;

class Eletronico extends Produto {
    private String marca;

    public Eletronico(String nome, double preco, int quantidade, String marca) {
        super(nome, preco, quantidade);
        this.marca = marca;
    }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    @Override
    public double calcularPrecoFinal() {
        double total = getPreco() * getQuantidade();
        return total * 1.15; // 15% de taxa
    }
}
