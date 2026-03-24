
package exercicio7;

import java.util.ArrayList;


public class Exercicio7 {


    public static void main(String[] args) {
         ArrayList<Forma> formas = new ArrayList<>();

        formas.add(new Quadrado(4));
        formas.add(new Retangulo(5, 3));
        formas.add(new Circulo(2.5));
        formas.add(new Triangulo(6, 4));

        for (Forma f : formas) {
            System.out.println(f.getNome() + " área: " + f.calcularArea());
        }
    }
}
    

