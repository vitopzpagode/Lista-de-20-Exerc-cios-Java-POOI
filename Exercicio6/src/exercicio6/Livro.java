
package exercicio6;

class Livro extends Produto {
    private String autor;

    public Livro(String nome, double preco, int quantidade, String autor) {
        super(nome, preco, quantidade);
        this.autor = autor;
    }

    public String getAutor() { return autor; }
    public void setAutor(String autor) { this.autor = autor; }

    @Override
    public double calcularPrecoFinal() {
        double total = getPreco() * getQuantidade();
        return total * 0.9; // 10% de desconto
    }
}
