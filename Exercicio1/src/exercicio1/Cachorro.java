
package exercicio1;

class Cachorro extends Animal {

    public Cachorro(String nome, int idade) {
        super(nome, idade, "Cachorro");
    }

    @Override
    public void emitirSom() {
        System.out.println(getNome() + " diz: Au Au");
    }
}
