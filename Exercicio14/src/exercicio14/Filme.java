
package exercicio14;

class Filme extends Midia {

    public Filme(String titulo, double duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Assistindo filme: " + getTitulo());
    }
}
