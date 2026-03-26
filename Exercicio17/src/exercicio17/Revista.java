
package exercicio17;

class Revista extends ItemBiblioteca {

    public Revista(String titulo, String codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("Revista emprestada por 3 dias: " + getTitulo());
        setDisponivel(false);
    }
}
