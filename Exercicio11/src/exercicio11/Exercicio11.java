
package exercicio11;


public class Exercicio11 {


    public static void main(String[] args) {
         Dispositivo d1 = new Computador("PC Gamer", "Dell");
        Dispositivo d2 = new Smartphone("iPhone", "Apple");
        Dispositivo d3 = new Tablet("Galaxy Tab", "Samsung");
        Dispositivo d4 = new Televisao("Smart TV", "LG");

        d1.ligar();
        d1.executarFuncao();
        d1.desligar();

        d2.ligar();
        d2.executarFuncao();
        d2.desligar();

        d3.ligar();
        d3.executarFuncao();
        d3.desligar();

        d4.ligar();
        d4.executarFuncao();
        d4.desligar();
    }
    
}
