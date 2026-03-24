
package exercicio5;

class Turma {
    private String nomeTurma;
    private Aluno aluno;

    public Turma(String nomeTurma, Aluno aluno) {
        this.nomeTurma = nomeTurma;
        this.aluno = aluno;
    }

    public String getNomeTurma() { return nomeTurma; }
    public void setNomeTurma(String nomeTurma) { this.nomeTurma = nomeTurma; }

    public Aluno getAluno() { return aluno; }
    public void setAluno(Aluno aluno) { this.aluno = aluno; }
}
