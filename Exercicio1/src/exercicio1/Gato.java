
package exercicio1;

class Gato extends Animal {

    public Gato(String nome, int idade) {
        super(nome, idade, "Gato");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Miau");
    }
}
