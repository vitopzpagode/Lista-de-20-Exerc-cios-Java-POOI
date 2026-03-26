
package exercicio14;

class Podcast extends Midia {

    public Podcast(String titulo, double duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Ouvindo podcast: " + getTitulo());
    }
}
