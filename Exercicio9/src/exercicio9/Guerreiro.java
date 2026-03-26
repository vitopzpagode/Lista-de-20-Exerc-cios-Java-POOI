
package exercicio9;

class Guerreiro extends Personagem {

    public Guerreiro(String nome, int vida, int nivel) {
        super(nome, vida, nivel);
    }

    @Override
    public void atacar() {
        System.out.println(getNome() + " ataca com espada poderosa!");
    }

    @Override
    public void defender() {
        System.out.println(getNome() + " levanta o escudo!");
    }
}
