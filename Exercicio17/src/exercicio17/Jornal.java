
package exercicio17;

class Jornal extends ItemBiblioteca {

    public Jornal(String titulo, String codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("Jornal não pode ser emprestado: " + getTitulo());
    }
}
