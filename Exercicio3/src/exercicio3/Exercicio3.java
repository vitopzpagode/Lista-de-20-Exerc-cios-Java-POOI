
package exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {
          Funcionario f1 = new Gerente("Vitor", 5000);
        Funcionario f2 = new Vendedor("Felipe", 3000);
        Funcionario f3 = new Programador("Ricardo", 4000);
        Funcionario f4 = new Designer("Murilo", 3500);

        f1.trabalhar();
        System.out.println("Bônus: " + f1.calcularBonus());

        f2.trabalhar();
        System.out.println("Bônus: " + f2.calcularBonus());

        f3.trabalhar();
        System.out.println("Bônus: " + f3.calcularBonus());

        f4.trabalhar();
        System.out.println("Bônus: " + f4.calcularBonus());
    }
    
}
