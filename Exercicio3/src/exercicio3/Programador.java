
package exercicio3;

class Programador extends Funcionario {

    public Programador(String nome, double salario) {
        super(nome, salario, "Programador");
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está programando sistemas");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.25;
    }
}
