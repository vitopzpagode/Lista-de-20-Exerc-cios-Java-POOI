
package exercicio1;

class Cavalo extends Animal {

    public Cavalo(String nome, int idade) {
        super(nome, idade, "Cavalo");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Relincho");
    }
}
