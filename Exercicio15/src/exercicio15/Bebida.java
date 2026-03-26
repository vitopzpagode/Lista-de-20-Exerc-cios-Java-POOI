
package exercicio15;

class Bebida extends ItemCardapio {

    public Bebida(String nome, double preco, String descricao) {
        super(nome, preco, descricao);
    }

    @Override
    public void preparar() {
        System.out.println("Servindo bebida: " + getNome());
    }

    @Override
    public double calcularPreco() {
        return getPreco(); // sem alteração
    }
}
