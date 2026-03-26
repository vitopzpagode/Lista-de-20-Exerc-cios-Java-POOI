
package exercicio20;

class Elefante extends Animal {

    public Elefante(String nome, int idade, double peso) {
        super(nome, idade, peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " faz barulho com a tromba!");
    }

    @Override
    public void alimentar() {
        System.out.println(getNome() + " está comendo plantas");
    }

    @Override
    public void movimentar() {
        System.out.println(getNome() + " está caminhando lentamente");
    }
}
