
package exercicio20;

public class Exercicio20 {

    public static void main(String[] args) {
         Animal[] animais = new Animal[4];

        animais[0] = new Leao("Simba", 5, 190);
        animais[1] = new Macaco("George", 3, 35);
        animais[2] = new Elefante("Dumbo", 10, 500);
        animais[3] = new Papagaio("Loro", 2, 2);

        for (Animal a : animais) {
            a.emitirSom();
            a.alimentar();
            a.movimentar();
            System.out.println("------");
    }
    
    }
}
