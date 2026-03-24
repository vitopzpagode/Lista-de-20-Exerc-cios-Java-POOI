
package exercicio3;

class Gerente extends Funcionario {

    public Gerente(String nome, double salario) {
        super(nome, salario, "Gerente");
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está gerenciando a equipe");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.3;
    }
}
