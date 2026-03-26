
package exercicio16;

class Medico extends Pessoa {
    private String especialidade;

    public Medico(String nome, int idade, String especialidade) {
        super(nome, idade);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }

    @Override
    public void realizarAtendimento() {
        System.out.println(getNome() + " está realizando consulta médica (" + especialidade + ")");
    }
}
