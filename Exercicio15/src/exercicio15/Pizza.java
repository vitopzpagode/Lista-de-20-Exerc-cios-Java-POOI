
package exercicio15;

class Pizza extends ItemCardapio {

    public Pizza(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Preparando pizza: " + getNome());
    }

    @Override
    public double calcularPreco() {
        return getPreco() * 1.1; // taxa de preparo
    }
}
