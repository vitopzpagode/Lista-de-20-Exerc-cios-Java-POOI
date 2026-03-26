
package exercicio11;

 class Smartphone extends Dispositivo {

    public Smartphone(String nome, String marca) {
        super(nome, marca);
    }

    Smartphone(String iPhone, String apple) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void executarFuncao() {
        System.out.println(getNome() + " está acessando redes sociais");
    }
}
