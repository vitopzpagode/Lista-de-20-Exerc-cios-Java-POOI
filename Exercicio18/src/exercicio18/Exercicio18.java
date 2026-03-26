
package exercicio18;


public class Exercicio18 {

    public static void main(String[] args) {
         Imovel i1 = new Casa("Rua A", 300000, 120);
        Imovel i2 = new Apartamento("Rua B", 200000, 80);
        Imovel i3 = new Terreno("Rua C", 150000, 200);
        Imovel i4 = new SalaComercial("Rua D", 400000, 100);

        System.out.println("Casa imposto: " + i1.calcularImposto());
        System.out.println("Apartamento imposto: " + i2.calcularImposto());
        System.out.println("Terreno imposto: " + i3.calcularImposto());
        System.out.println("Sala Comercial imposto: " + i4.calcularImposto());
    }
    
}
