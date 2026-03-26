
package exercicio19;


public class Exercicio19 {

    public static void main(String[] args) {
        Curso c1 = new CursoPresencial("Java POO", 80, 1000);
        Curso c2 = new CursoOnline("HTML e CSS", 40, 500);
        Curso c3 = new CursoTecnico("Informática", 1200, 12000);
        Curso c4 = new CursoLivre("Photoshop", 20, 300);

        c1.exibirInformacoes();
        System.out.println("Mensalidade: " + c1.calcularMensalidade());

        c2.exibirInformacoes();
        System.out.println("Mensalidade: " + c2.calcularMensalidade());

        c3.exibirInformacoes();
        System.out.println("Mensalidade: " + c3.calcularMensalidade());

        c4.exibirInformacoes();
        System.out.println("Mensalidade: " + c4.calcularMensalidade());
    }
    
}
