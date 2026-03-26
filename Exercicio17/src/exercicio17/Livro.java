
package exercicio17;

class Livro extends ItemBiblioteca {

    public Livro(String titulo, String codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("Livro emprestado por 7 dias: " + getTitulo());
        setDisponivel(false);
    }
}
