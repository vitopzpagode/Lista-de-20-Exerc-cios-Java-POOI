
package exercicio14;

class Audiolivro extends Midia {

    public Audiolivro(String titulo, double duracao, String autor) {
        super(titulo, duracao, autor);
    }

    @Override
    public void reproduzir() {
        System.out.println("Ouvindo audiolivro: " + getTitulo());
    }
}
