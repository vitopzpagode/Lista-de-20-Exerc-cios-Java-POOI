
package exercicio11;

class Computador extends Dispositivo {

    public Computador(String nome, String marca) {
        super(nome, marca);
    }

    Computador(String pc_Gamer, String dell) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está rodando programas pesados");
    }
}
