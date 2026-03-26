
package exercicio16;

class Enfermeiro extends Pessoa {
    private String setor;

    public Enfermeiro(String nome, int idade, String setor) {
        super(nome, idade);
        this.setor = setor;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    @Override
    public void realizarAtendimento() {
        System.out.println(getNome() + " está auxiliando no setor de " + setor);
    }
}
