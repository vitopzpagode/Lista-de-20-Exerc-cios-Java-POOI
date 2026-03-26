
package exercicio9;

public class Exercicio9 {


    public static void main(String[] args) {
         Personagem p1 = new Guerreiro("Thor", 100, 10);
        Personagem p2 = new Mago("Merlin", 80, 12);
        Personagem p3 = new Arqueiro("Legolas", 90, 11);
        Personagem p4 = new Paladino("Arthur", 110, 9);

        p1.atacar();
        p1.defender();

        p2.atacar();
        p2.defender();

        p3.atacar();
        p3.defender();

        p4.atacar();
        p4.defender();
    }
    
}
