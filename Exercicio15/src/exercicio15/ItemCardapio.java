
package exercicio15;

class ItemCardapio {
    private String nome;
    private double preco;
    private String descricao;

    public ItemCardapio(String nome, double preco, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.descricao = descricao;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }

    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }

    public void preparar() {
        System.out.println("Preparando item...");
    }

    public double calcularPreco() {
        return preco;
    }
}
