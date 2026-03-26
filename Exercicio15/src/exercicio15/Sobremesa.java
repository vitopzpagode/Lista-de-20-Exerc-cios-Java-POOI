
package exercicio15;

class Sobremesa extends ItemCardapio {

    public Sobremesa(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando sobremesa: " + getNome());
    }

    @Override
    public double calcularPreco() {
        return getPreco() * 0.95; // desconto
    }
}
