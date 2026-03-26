
package exercicio18;

class Apartamento extends Imovel {

    public Apartamento(String endereco, double preco, double metragem) {
        super(endereco, preco, metragem);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.01;
    }
}
