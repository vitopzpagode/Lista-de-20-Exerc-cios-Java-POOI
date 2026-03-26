
package exercicio10;

public class Exercicio10 {

    public static void main(String[] args) {
       
        Transporte t1 = new Taxi(4, "Taxi RS", 10);
        Transporte t2 = new Uber(4, "Uber", 8, 1.5);
        Transporte t3 = new Onibus(40, "Carris", 5);
        Transporte t4 = new Metro(200, "Trensurb", 6);

        System.out.println("Taxi: " + t1.calcularTarifa());
        System.out.println("Uber: " + t2.calcularTarifa());
        System.out.println("Ônibus: " + t3.calcularTarifa());
        System.out.println("Metrô: " + t4.calcularTarifa());
    }
    
}
