
package exercicio6;

public class Exercicio6 {

    public static void main(String[] args) {
         Produto p1 = new Livro("Java Básico", 100, 2, "Autor X");
        Produto p2 = new Eletronico("Celular", 1500, 1, "Samsung");
        Produto p3 = new Roupa("Camiseta", 50, 4, "M");
        Produto p4 = new Alimento("Arroz", 20, 5, "12/2026");

        System.out.println("Livro: " + p1.calcularPrecoFinal());
        System.out.println("Eletrônico: " + p2.calcularPrecoFinal());
        System.out.println("Roupa: " + p3.calcularPrecoFinal());
        System.out.println("Alimento: " + p4.calcularPrecoFinal());
    }
    
}
