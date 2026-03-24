package exercicio5;


public class Exercicio5 {


    public static void main(String[] args) {
         Pessoa p1 = new Professor("Vitor", 40, "Matemática");
        Pessoa p2 = new Coordenador("Murilo", 35, "Ensino Médio");

        Aluno aluno = new Aluno("Felipe", 16, 8.5, 7.5);
        Turma turma = new Turma("1º Ano", aluno);

        p1.apresentar();
        p1.trabalhar();

        p2.apresentar();
        p2.trabalhar();

        aluno.apresentar();
        System.out.println("Média: " + aluno.calcularMedia());
    }
    
}
