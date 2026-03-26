
package exercicio12;


public class Exercicio12 {

    public static void main(String[] args) {
         Profissao p1 = new Medico("Vitor", "Cardiologia", 10000);
        Profissao p2 = new Professor("Felipe", "Matemática", 4000);
        Profissao p3 = new Advogado("Murilo", "Direito Civil", 7000);
        Profissao p4 = new Engenheiro("Ricardo", "Civil", 8000);

        p1.executarTrabalho();
        p2.executarTrabalho();
        p3.executarTrabalho();
        p4.executarTrabalho();
    }
    
}
