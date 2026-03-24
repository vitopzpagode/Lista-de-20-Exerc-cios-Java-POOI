
package exercicio8;

class Pix extends Pagamento {
    private String chavePix;

    public Pix(double valor, String data, String descricao, String chavePix) {
        super(valor, data, descricao);
        this.chavePix = chavePix;
    }

    public String getChavePix() { return chavePix; }
    public void setChavePix(String chavePix) { this.chavePix = chavePix; }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento de R$" + getValor() + " via PIX. Chave: " + chavePix);
    }
}
