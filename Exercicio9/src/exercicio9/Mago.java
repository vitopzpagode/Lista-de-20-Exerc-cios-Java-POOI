
package exercicio9;

class Mago extends Personagem {

    public Mago(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " lança uma magia!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " cria um escudo mágico!");
    }
}
