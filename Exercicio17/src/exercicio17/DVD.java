
package exercicio17;

class DVD extends ItemBiblioteca {

    public DVD(String titulo, String codigo, boolean disponivel) {
        super(titulo, codigo, disponivel);
    }

    @Override
    public void emprestar() {
        System.out.println("DVD emprestado por 5 dias: " + getTitulo());
        setDisponivel(false);
    }
}
