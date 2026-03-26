
package exercicio11;

class Televisao extends Dispositivo {

    public Televisao(String nome, String marca) {
        super(nome, marca);
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está exibindo canais e streaming");
    }
}
