
package exercicio12;

class Medico extends Profissao {

    public Medico(String nome, String area, double salario) {
        super(nome, area, salario);
    }

    @Override
    public void executarTrabalho() {
        System.out.println(getNome() + " está atendendo pacientes");
    }
}