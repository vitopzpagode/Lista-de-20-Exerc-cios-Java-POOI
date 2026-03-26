
package exercicio14;

class Musica extends Midia {

    public Musica(String titulo, double duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + getTitulo() + " - " + getAutor());
    }
}
