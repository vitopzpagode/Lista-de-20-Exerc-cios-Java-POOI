
package exercicio11;

class Dispositivo {
    private String nome;
    private String marca;
    private boolean ligado;

    public Dispositivo(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
        this.ligado = false;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getMarca() { return marca; }
    public void setMarca(String marca) { this.marca = marca; }

    public boolean isLigado() { return ligado; }
    public void setLigado(boolean ligado) { this.ligado = ligado; }

    public void ligar() {
        ligado = true;
        System.out.println(nome + " foi ligado");
    }

    public void desligar() {
        ligado = false;
        System.out.println(nome + " foi desligado");
    }

    public void executarFuncao() {
        System.out.println("Executando função genérica");
    }

    void ligar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
