
package exercicio9;

class Paladino extends Personagem {

    public Paladino(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com luz sagrada!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " usa proteção divina!");
    }
}
