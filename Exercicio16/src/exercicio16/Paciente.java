
package exercicio16;

class Paciente extends Pessoa {
    private String cpf;

    public Paciente(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    @Override
    public void exibirDados() {
        System.out.println("Paciente: " + getNome() + ", Idade: " + getIdade() + ", CPF: " + cpf);
    }
}
