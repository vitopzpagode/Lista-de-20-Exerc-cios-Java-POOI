
package exercicio1;

public class Exercicio1 {


    public static void main(String[] args) {
       
        Animal a1 = new Cachorro("Cachorro", 3);
        Animal a2 = new Gato("Gato", 2);
        Animal a3 = new Vaca("Vaca", 5);
        Animal a4 = new Cavalo("Cavalo", 4);

        a1.emitirSom();
        a2.emitirSom();
        a3.emitirSom();
        a4.emitirSom();
    }
}
