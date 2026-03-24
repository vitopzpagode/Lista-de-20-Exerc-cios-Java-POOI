
package exercicio3;

class Designer extends Funcionario {

    public Designer(String nome, double salario) {
        super(nome, salario, "Designer");
    }

    @Override
    public void trabalhar() {
        System.out.println(getNome() + " está criando designs");
    }

    @Override
    public double calcularBonus() {
        return getSalario() * 0.15;
    }
}
