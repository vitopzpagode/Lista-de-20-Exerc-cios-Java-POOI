
package exercicio15;

class Hamburguer extends ItemCardapio {

    public Hamburguer(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Montando hambúrguer: " + getNome());
    }

    @Override
    public double calcularPreco() {
        return getPreco() * 1.05;
    }
}
